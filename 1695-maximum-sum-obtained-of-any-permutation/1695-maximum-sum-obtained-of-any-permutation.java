// class Solution {
//     public int maxSumRangeQuery(int[] nums, int[][] requests) {
//         int[] arr= new int[nums.length];
//         for(int i=0;i<requests.length;i++){
//             arr[requests[i][0]]++;
//             if(requests[i][1]+1<arr.length){
//                 arr[requests[i][1]+1] = -1;
//             }
//         }
//         for(int i=1; i<arr.length;i++){
//             arr[i] = arr[i]+arr[i-1];
//         }
//         Arrays.sort(arr);
//         Arrays.sort(nums);
//         long sum=0;
//         for(int i=nums.length-1;i>=0;i--){
//             sum += (long)arr[i]*nums[i]%1_000_000_007;
//         }
//         return (int)sum;
//     }
// }

import java.util.Arrays;

class Solution {
    public int maxSumRangeQuery(int[] nums, int[][] requests) {
        int[] arr = new int[nums.length];
        
        // Marking frequency changes
        for (int i = 0; i < requests.length; i++) {
            arr[requests[i][0]]++;
            if (requests[i][1] + 1 < arr.length) {
                arr[requests[i][1] + 1]--;
            }
        }
        
        // Computing prefix sums
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1];
        }
        
        // Sorting arrays
        Arrays.sort(arr);
        Arrays.sort(nums);
        
        // Calculating maximum sum
        long sum = 0;
        int mod = 1_000_000_007;
        for (int i = nums.length - 1; i >= 0; i--) {
            sum = (sum + (long)arr[i] * nums[i] % mod) % mod;
        }
        
        return (int)sum;
    }
}
