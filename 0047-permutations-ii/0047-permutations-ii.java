class Solution {
    
    public void helper(List<Integer> temp, List<List<Integer>> ans,Map<Integer,Integer> map,int length){
        if(length==temp.size()){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int nums: map.keySet()){
            int count = map.get(nums);
            if(count==0){
                continue;
            }
            temp.add(nums);
            map.put(nums,count-1);

            helper(temp,ans,map,length);
            temp.remove(temp.size()-1);
            map.put(nums,count);
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<List<Integer>> ans=new ArrayList<>();
        helper(new ArrayList<>(),ans,map,nums.length);
        return ans;
    }
}