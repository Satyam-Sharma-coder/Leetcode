class Solution {
    public int findMin(int[] nums) {
        int s=0;
        int e=nums.length-1;
        if(nums[s]<nums[e]) return nums[0];
        while(s<e){
            int mid=(s+e)/2;
            if(nums[mid]>nums[e]) s=mid+1;
            else if (nums[mid]<nums[e]) e=mid;
            else e--;
        }
        return nums[s];
    }
}