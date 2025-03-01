class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        if(arr.length==1) return 1;
        Arrays.sort(arr);
        arr[0]=1;
        int max=0;
        for(int i=1;i<arr.length;i++){
            arr[i]=Math.min(arr[i],arr[i-1]+1);
        }
        return arr[arr.length-1];
    }
}