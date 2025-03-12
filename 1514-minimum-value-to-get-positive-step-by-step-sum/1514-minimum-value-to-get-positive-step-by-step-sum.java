class Solution {
    public int minStartValue(int[] nums) {
        int min = Math.min(1, nums[0]);  
        for(int i = 1; i < nums.length; i++){
            nums[i] += nums[i - 1];
            min = Math.min(min , nums[i]);
        }
        min = (min <= 0) ? -min + 1 : min; 
        return min;
    }
}