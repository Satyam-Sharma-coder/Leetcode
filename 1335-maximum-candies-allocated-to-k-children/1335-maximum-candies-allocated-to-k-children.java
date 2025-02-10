class Solution {
    public static boolean isPossible(int[] arr, long mid, long k) {
        long count = 0;
        for (int i : arr) {
            count += (i / mid);
            if (count >= k) {
                return true; // Early return for efficiency
            }
        }
        return false;
    }

    public int maximumCandies(int[] arr, long k) {
        // Step 1: Compute the total number of candies
        long totalCandies = 0;
        for (int i : arr) {
            totalCandies += i;
        }

        // Step 2: If total candies < k, return 0 (impossible to distribute)
        if (totalCandies < k) {
            return 0;
        }

        // Step 3: Binary search for the maximum candies per child
        long min = 1; // Minimum candies per child must be at least 1
        long max = 0;

        // Find the maximum pile size
        for (int i : arr) {
            max = Math.max(max, i);
        }

        int ans = 0;

        while (min <= max) {
            long mid = min + (max - min) / 2; // Avoid potential overflow
            if (isPossible(arr, mid, k)) {
                ans = (int) mid; // Update answer
                min = mid + 1;   // Search for a larger possible value
            } else {
                max = mid - 1;   // Search for a smaller possible value
            }
        }
        return ans;
    }
}
