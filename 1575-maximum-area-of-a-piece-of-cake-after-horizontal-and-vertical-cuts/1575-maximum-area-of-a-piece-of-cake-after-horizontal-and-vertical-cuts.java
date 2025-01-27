class Solution {
    public long maxDiff(int[] arr,int length){
        Arrays.sort(arr);
        long max_diff = arr[0];
        for(int i=1;i<arr.length;i++){
            max_diff = Math.max(max_diff,arr[i]-arr[i-1]);
        }
        max_diff = Math.max(max_diff,length-arr[arr.length-1]);
        return max_diff;
    }
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        long x = maxDiff(horizontalCuts,h);
        long y = maxDiff(verticalCuts,w);
        return (int)((x*y)%1000000007);
    }
}