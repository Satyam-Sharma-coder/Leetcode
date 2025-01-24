class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int[] lastIndex = new int[10001];
        int i = 0;
        int maxSum = 0, currentSum = 0;

        for (int j = 0; j < n; j++) {
            int num = nums[j];
            if (lastIndex[num] > 0) {
                while (i < lastIndex[num]) {
                    currentSum -= nums[i];
                    i++;
                }
            }
            currentSum += num;
            maxSum = Math.max(maxSum, currentSum);
            lastIndex[num] = j+1;
        }

        return maxSum;
    }
}
