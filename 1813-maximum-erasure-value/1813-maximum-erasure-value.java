class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int[] lastIndex = new int[10001]; // Tracks last seen index for each number
        int i = 0; // Start of the sliding window
        int maxSum = 0, currentSum = 0;

        for (int j = 0; j < n; j++) {
            int num = nums[j];

            // If the number was seen before and is within the current window, shrink the window
            if (lastIndex[num] > 0) {
                while (i < lastIndex[num]) {
                    currentSum -= nums[i]; // Remove elements from the window sum
                    i++;
                }
            }

            // Add the current number to the window
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);

            // Update the last seen index of the current number
            lastIndex[num] = j + 1; // Use j + 1 to differentiate unvisited elements (default 0)
        }

        return maxSum;
    }
}
