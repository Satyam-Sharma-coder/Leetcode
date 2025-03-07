class Solution {
    public int findMaxK(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            map.add(nums[i]);
        }
        int max=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0 && map.contains(-nums[i])){
                max=Math.max(max,nums[i]);
            }
        }
        return max;
    }
}