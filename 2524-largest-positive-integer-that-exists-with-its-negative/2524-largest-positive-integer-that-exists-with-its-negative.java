class Solution {
    public int findMaxK(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1);
        }
        int max=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0 && map.containsKey(-nums[i])){
                max=Math.max(max,nums[i]);
            }
        }
        return max;
    }
}