class Solution {
    public int[] twoSum(int[] nums, int target) {
        int start=0;
        int[] ans = new int[2];
        int end=nums.length-1;
        while(start<end){
            if(nums[start]+nums[end]==target){
                ans[0]=start+1;
                ans[1]=end+1;
                start++;
                end--;
            }
            else if(nums[start]+nums[end]>target){
                end--;
            }
            else{
                start++;
            }
        }
        return ans;
    }
}