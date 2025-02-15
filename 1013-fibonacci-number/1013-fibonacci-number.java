class Solution {
    public int fib(int n) {
        // int dp[] = new int[n+1];
        // for(int i=0;i<dp.length;i++){
        //     dp[i]= -1;
        // }
        int ans=sum(n);
        return ans;

    }
    public int sum(int n){
        if(n==1 || n==0){
            return n;
        }
        
        return sum(n-1)+sum(n-2);
    }
}