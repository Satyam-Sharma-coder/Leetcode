class Solution {
    public int numRabbits(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int freq = map.get(nums[i]);
                if(freq==0){
                    ans += nums[i]+1;
                    map.put(nums[i],nums[i]);
                }else{
                    map.put(nums[i],freq-1);
                }
            }else{
                ans += nums[i]+1;
                map.put(nums[i],nums[i]);
            }
        }
        return ans;
    }
}