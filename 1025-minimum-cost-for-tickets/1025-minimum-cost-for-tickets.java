class Solution {
    public int binarySearch(int[] days, int start,int end,int target){
        while(start<=end){
            int mid=(start+end)/2;
            if(days[mid]>=target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
    public int helper(int[] days,int[] costs,int i,int[] dp){
        if(i>days.length-1){
            return 0;
        }
        if(dp[i]!=-1) return dp[i];



        int two=costs[0]+helper(days,costs,i+1,dp);

        int dayv=days[i]+7;
        int idx=binarySearch(days,i,days.length-1,dayv);
        int seven=costs[1]+helper(days,costs,idx,dp);

        int dayv2=days[i]+30;
        int idx2=binarySearch(days,i,days.length-1,dayv2);
        int thirty=costs[2]+helper(days,costs,idx2,dp);
        return dp[i]=Math.min(two,Math.min(seven,thirty));
    }
    public int mincostTickets(int[] days, int[] costs) {
        int[] dp= new int[days.length];
        Arrays.fill(dp,-1);
        return helper(days,costs,0,dp);
    }
}