class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ans = new int[nums.length];
        int k=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]<pivot){
                ans[k++]=nums[j];
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]==pivot){
                ans[k++]=nums[j];
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]>pivot){
                ans[k++]=nums[j];
            }
        }
        return ans;
    }
}