class Solution {
    public int removeDuplicates(int[] nums) {
        int start=2;
        int k=2;

        while(start<nums.length){
            if(nums[start]!=nums[k-2]){
                nums[k]=nums[start];
                k++;
                start++;
            }
            else{
                start++;
            }

        }
        return k;
    }
}