class Solution {
    public static boolean isPossible(int[] arr, long mid, long k) {
        long count = 0;
        for (int i : arr) {
            count += (i / mid);
            if (count >= k) {
                return true; 
            }
        }
        return false;
    }

    public int maximumCandies(int[] arr, long k) {
        long totalCandies = 0;
        // for (int i : arr) {
        //     totalCandies += i;
        // }


        // if (totalCandies < k) {
        //     return 0;
        // }

        long min = 1; 
        long max = 0;


        for (int i : arr) {
            max = Math.max(max, i);
        }

        int ans = 0;

        while (min <= max) {
            long mid = min + (max - min) / 2;
            if (isPossible(arr, mid, k)) {
                ans = (int) mid;
                min = mid + 1;  
            } else {
                max = mid - 1;  
            }
        }
        return ans;
    }
}
