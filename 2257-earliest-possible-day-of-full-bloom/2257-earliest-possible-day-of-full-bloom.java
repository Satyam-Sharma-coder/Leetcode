class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int n=plantTime.length;
        int ans[][] = new int[n][2];
        for(int i=0;i<n;i++){
            ans[i][0]=plantTime[i];
            ans[i][1]= growTime[i];
        }

        Arrays.sort(ans, (a, b) -> Integer.compare(b[1], a[1]));

        int mxtime = 0;
        int tp=0;
        for(int i=0;i<n;i++){
            tp += ans[i][0];
            mxtime = Math.max(tp+ans[i][1],mxtime);
        }
        return mxtime;
    }
}