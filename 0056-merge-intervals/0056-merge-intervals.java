class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> a[0]-b[0]);
        ArrayList<int[]> ans = new ArrayList<>();
        int last = intervals[0][1];
        for(int i=0,j=0;i<intervals.length;i++){
            last = Math.max(last,intervals[i][1]);
            if(i==intervals.length-1 || last< intervals[i+1][0]){
                int[] arr = new int[]{intervals[j][0], last};
                ans.add(arr);
                j=i+1;
            }
        }
        return ans.toArray(new int[ans.size()][2]);
    }
}