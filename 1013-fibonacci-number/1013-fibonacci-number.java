class Solution {
    public int fib(int n) {
        int dp[] = new int[n+1];
        for(int i=0;i<dp.length;i++){
            dp[i]= -1;
        }
        int ans=sum(n,dp);
        return ans;

    }
    public int sum(int n,int[] dp){
        if(n==1 || n==0){
            return n;
        }
        if(dp[n]!= -1){
            return dp[n];
        }
        
        return dp[n]=sum(n-1,dp)+sum(n-2,dp);
    }
}