class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int start =0;
        int end = 0;
        int minLength =arr.length+1;
        int sum = 0;
        while(end < arr.length){
            sum += arr[end];
            while(sum >= target && start < arr.length){
                minLength = Math.min(minLength, end-start+1);
                sum -= arr[start];
                start++;
            }
            
            end++;
        }
        if(minLength == arr.length+1){
            return 0;
        }
        return minLength;
    }
}