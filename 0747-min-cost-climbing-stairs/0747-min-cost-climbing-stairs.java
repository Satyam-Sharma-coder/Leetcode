class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] dp=new int[n+1];
        for(int i=0;i<=n;i++) dp[i]=-1;
        int ans=recurssion(0,n,cost,dp);
        return ans;
    }
    public int recurssion(int i,int n,int[] cost,int[] dp){
        if(dp[i]!=-1) return dp[i];
        if(i>=n-1){
            return 0;
        } 
        int cost1=cost[i]+recurssion(i+1,n,cost,dp);
        int cost2=cost[i+1]+recurssion(i+2,n,cost,dp);
        return dp[i]=Math.min(cost1,cost2);
    }
}