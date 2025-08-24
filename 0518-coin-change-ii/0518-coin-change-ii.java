class Solution {
    public int helper(int amount,int coins[],int i,int dp[][]){
        if(amount==0){
            return 1;
        }
        if(i>coins.length-1 || amount<0){
            return 0;
        }
        if(dp[amount][i]!=-1) return dp[amount][i];
        int a=helper(amount-coins[i],coins,i,dp);
        int b=helper(amount,coins,i+1,dp);
        return dp[amount][i]=a+b;
    }
    public int change(int amount, int[] coins) {
        int dp[][] = new int[amount+1][coins.length+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(amount,coins,0,dp);
    }
}