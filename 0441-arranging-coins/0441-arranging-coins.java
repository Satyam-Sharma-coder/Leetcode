class Solution {
    public int arrangeCoins(int n) {
        long min=1;
        long max=n;
        long ans=0;
        while(min<=max){
            long mid = (min+max)/2;
            if(isPossible(n,mid)){
                ans=mid;
                min=mid+1;
            }
            else{
                max=mid-1;
            }
        }
        return (int)ans;
    }
    public static boolean isPossible(int n,long mid){
        long ans = (long)mid*(mid+1)/2;
        return ans<=n;
    }
}