class Solution {
    public int helper(int n, int k, int target,int[][] dp){
        if(n==0 && target==0){
            return 1;
        }
        if(n<=0 || target<=0){
            return 0;
        }
        if(dp[n][target]!=-1){
            return dp[n][target];
        }
        int ans=0;
        for(int i=1;i<=k;i++){
            ans=ans+helper(n-1,k,target-i,dp);
            ans=ans%1000_000_007;
        }
        return dp[n][target]=ans;

    }
    public int numRollsToTarget(int n, int k, int target) {
        int[][] dp= new int[n+1][target+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(n,k,target,dp);
    }
}