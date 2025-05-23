class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int sum = fibo(n,dp);
        return sum;
    }
    int fibo(int n,int[] dp){
        if(dp[n]!=-1){
            return dp[n];
        }
        if(n==0 || n==1){
            dp[n]=n;
            return dp[n];
        }
        dp[n]=fibo(n-1,dp)+fibo(n-2,dp);
        return dp[n];
    }
}