class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<nums[end]){
                if(nums[end]>=target && target>nums[mid]){
                start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            else{
                if((target<nums[mid] && target<=nums[end]) || (target>nums[mid] && target>=nums[end])){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        return -1;

    }
}