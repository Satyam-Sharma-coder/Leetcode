class Solution {
    public int largestPerimeter(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        for(int j=2;j<nums.length;j++){
            if(nums[j]<nums[j-1]+nums[j-2]){
                ans=Math.max(ans,nums[j]+nums[j-1]+nums[j-2]);
            }
        }
        return ans;
    }
}