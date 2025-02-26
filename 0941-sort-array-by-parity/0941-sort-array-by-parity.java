class Solution {
    public int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=0;
        while(i<nums.length && j<nums.length){
            if(nums[i]%2 != 0){
                i++;
            }else if(nums[i]%2==0 && nums[j]%2 != 0){
                int temp = nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j++;
            }else{
                i++;
                j++;
            }
            
        }
        return nums;
    }
}