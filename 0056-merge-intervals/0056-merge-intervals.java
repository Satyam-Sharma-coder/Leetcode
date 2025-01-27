class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0]-b[0]);
        List<int[]> ans = new ArrayList<>();
        int end = intervals[0][1];

        for(int j=0,i=1;i<=intervals.length;i++){
            if(i== intervals.length || intervals[i][0]>end){
                ans.add(new int[] {intervals[j][0],end});
                j=i;
            }
            if(i != intervals.length){
                end = Math.max(end,intervals[i][1]);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}