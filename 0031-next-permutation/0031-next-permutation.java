class Solution {
    public static void reverseArray(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i == -1) {
            reverseArray(nums, 0, nums.length - 1);
            return;
        }
        int j = nums.length - 1;
        while (nums[i] >= nums[j]) {
            j--;
        }
        swap(nums, i, j);
        reverseArray(nums, i + 1, nums.length - 1);
        return;
    }
}