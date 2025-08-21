class Solution {
    public int helper(int i, int[] nums,int[] dp){
        if(i<dp.length && dp[i]!=-1 ){
            return dp[i];
        }
        if(i >= nums.length-1){
            if(i==nums.length-1) return nums[i];
            return 0;
        }
        int val1 = nums[i] + helper(i+2, nums,dp);
        int val2 = nums[i+1] + helper(i+3, nums,dp);
        return dp[i]=Math.max(val1, val2);
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[]dp=new int[nums.length];
        int[]dp2=new int[2*nums.length];
        Arrays.fill(dp,-1);
        Arrays.fill(dp2,-1);
        int[] nums2=new int[nums.length*2];
        for(int i=0;i<2*nums.length;i++){
            nums2[i]=nums[i%nums.length];
        }
        return helper(0,nums2,dp2)-helper(0,nums,dp);
    }
}