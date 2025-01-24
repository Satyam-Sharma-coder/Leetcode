class Solution {
    public int numSubarraysWithAtmostK(int[] nums, int goal) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int count = 0;
        int n = nums.length;
        while(end<n){
            sum += nums[end];
            while(start<=end && sum > goal){
                sum -= nums[start];
                start++;
            }
            count += (end-start+1);
            end++;
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int ans1 = numSubarraysWithAtmostK(nums,goal);
        int ans2 = numSubarraysWithAtmostK(nums,goal-1);
        return ans1-ans2;
    }
}