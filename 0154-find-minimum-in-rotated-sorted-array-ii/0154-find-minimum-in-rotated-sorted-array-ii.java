class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        int mid=0;
        if(nums[s]<nums[e]) return nums[0];
        while(s<e){
            mid=(s+e)/2;
            if(nums[mid]>nums[e]) s=mid+1;
            else if (nums[mid]<nums[e]) e=mid;
            else e--;
        }
        return Math.min(nums[s],nums[e]);
    }
}