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
        int n=nums.length;
        int index=-1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                index=i-1;
                break;
            }
        }
        if(index!=-1){
            int swap_index=index;
            for(int j=nums.length-1;j>=index+1;j--){
                if(nums[j]>nums[index]){
                    swap_index=j;
                    break;
                }
            }
            swap(nums,index,swap_index);
        }
        reverseArray(nums,index+1,nums.length-1);

    }
}