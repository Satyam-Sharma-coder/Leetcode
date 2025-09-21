class Solution {
    public void helper(int i,int length,List<Integer> temp,List<List<Integer>> ans,int[] nums){
        if(i==length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[i]);
        helper(i+1,length,temp,ans,nums);
        temp.remove(temp.size()-1);
        helper(i+1,length,temp,ans,nums);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        helper(0,nums.length,new ArrayList<>(),ans,nums);
        return ans;
    }
}