class Solution {
    public static int findval(int[] nums, int k){
        int start =0;
        int end = 0;
        int count = 0;
        while(end < nums.length){
            if(nums[end]%2!=0){
                k--;
            }
            while(k<0 && start<nums.length){
                if(nums[start]%2!=0){
                    k++;
                }
                start++;
            }
            count += (end-start+1);
            end++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int ans1=findval(nums,k);
        int ans2=findval(nums,k-1);
        return Math.abs(ans2-ans1);
    }
}