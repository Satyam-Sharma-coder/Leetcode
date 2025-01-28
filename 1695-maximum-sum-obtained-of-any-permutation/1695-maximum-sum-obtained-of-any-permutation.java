class Solution {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        int[] arr= new int[nums.length];
        for(int i=0;i<requests.length;i++){
            arr[requests[i][0]]++;
            if(requests[i][1]+1<arr.length){
                arr[requests[i][1]+1]--;
            }
        }
        for(int i=1; i<arr.length;i++){
            arr[i] = arr[i]+arr[i-1];
        }
        Arrays.sort(arr);
        Arrays.sort(nums);
        long sum=0;
        for(int i=nums.length-1;i>=0;i--){
            sum = (sum + (long)nums[i]*arr[i])%1_000_000_007;
        }
        return (int)sum;
    }
}


