class Solution {
    public int isPossible(int[] nums, int mid){
        int count=0;
        for(int num:nums){
            if(num>=mid) count++;
        }
        return count;
    }
    public int specialArray(int[] nums) {
        int start=1;
        int end=0;
        for(int i:nums){
            end=Math.max(end,i);
        }
        while(start<=end){
            int mid = (start+end)/2;
            if(isPossible(nums,mid)==mid){
                return mid;
            }
            if(isPossible(nums,mid)>mid){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}