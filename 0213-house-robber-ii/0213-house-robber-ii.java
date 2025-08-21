class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];

        int[] dp = new int[2*nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<dp.length;i++){
            dp[i]=Math.max(dp[i-1],nums[i%nums.length]+dp[i-2]);
        }
        return dp[2*nums.length-1]-dp[nums.length-1];
    }
}