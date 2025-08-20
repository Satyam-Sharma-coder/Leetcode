class Solution {
    public int fibo(int n,int[] dp){
        if(dp[n]!=-1){
            return dp[n];
        }
        if(n ==0 || n==1){
            dp[n]=n;
            return n;
        } 
        return dp[n]=fib(n-1)+fib(n-2);
    }
    public int fib(int n) {
        int []dp= new int[n+1];
        Arrays.fill(dp,-1);
        return fibo(n, dp);
    }
}