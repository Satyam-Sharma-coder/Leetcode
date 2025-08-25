class Solution {
    HashSet<Integer> s = new HashSet<>();
    public int mincostTickets(int[] days, int[] costs) {
        int lastday = days[days.length-1]+30;
        int[] dp =new int[lastday+1];
        Arrays.fill(dp,-1);
        for(int n: days){
            s.add(n);
        }
        return mincost(dp,days,costs, days[0]);
    }
    public  int mincost(int [] dp,int[] days,int[] cost, int n){
        if(n>days[days.length-1]){
            dp[n]=0;
            return 0;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        if(!s.contains(n)){
            dp[n] = mincost(dp,days,cost,n+1);
            return  dp[n];
        }
        int oneday=cost[0]+ mincost(dp,days,cost,n+1);
        int sevenday=cost[1]+ mincost(dp,days,cost,n+7);
        int thirtyday=cost[2]+mincost(dp,days,cost,n+30);
        dp[n]= Math.min(oneday, Math.min(sevenday,thirtyday));
        return dp[n];


    }
}