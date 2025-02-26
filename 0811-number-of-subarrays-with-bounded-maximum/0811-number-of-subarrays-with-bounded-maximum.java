class Solution {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int prev=0;
        int count=0;
        int end=0;
        int start=0;
        while(end<nums.length){
            if(left<=nums[end] && nums[end]<=right){
                prev=end-start+1;
                count+=prev;
            }
            else if(left>nums[end]){
                count+=prev;
            }
            else{
                start=end+1;
                prev=0;

            }
            end++;
        }
        return count;
    }
}