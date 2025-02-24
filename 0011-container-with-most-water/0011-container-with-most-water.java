class Solution {
    public int maxArea(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int ans=0;
        while(start<end){
            int h=Math.min(nums[start],nums[end]);
            int w=end-start;
            ans=Math.max(ans,h*w);
            if(nums[start]>nums[end]){
                end--;
            }
            else{
                start++;
            }
        }
        return ans;
    }
}