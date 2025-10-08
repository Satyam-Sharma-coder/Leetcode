class Solution {
    public int removeDuplicates(int[] nums) {
        int j=2;
        int i=2;

        while(j<nums.length){
            if(nums[j]!=nums[i-2]){
                nums[i]=nums[j];
                i++;
                j++;
            }
            else{
                j++;
            }

        }
        return i;
    }
}