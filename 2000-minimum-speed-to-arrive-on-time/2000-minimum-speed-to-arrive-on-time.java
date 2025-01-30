class Solution {
    public boolean isPossible(int[] dist, int mid,double h){
        double currh = 0;
        for (int i = 0; i < dist.length - 1; i++) {
            currh += Math.ceil((double) dist[i] / mid);
        }
        currh += (double) dist[dist.length - 1] / mid;
        return currh <= h;
    }
    public int minSpeedOnTime(int[] dist, double hour) {
        int start=1;
        int end = (int) 1e7;
        for(int i: dist){
            end=Math.max(end,i);
        }
        int ans =-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(isPossible(dist,mid,hour)){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
}