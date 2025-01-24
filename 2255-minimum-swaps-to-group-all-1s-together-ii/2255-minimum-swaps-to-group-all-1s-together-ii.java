class Solution {
    public int minSwaps(int[] nums) {
        int ones = 0;
        for(int i: nums){
            ones += i;
        }
        int currCount=0;
        for(int i=0;i<ones;i++){
            if(nums[i]==0){
                currCount ++;
            }
        }
        int minCount = currCount;
        int start = 0;
        int end = ones;
        while(end<nums.length+ones){
            if(nums[start]==0){
                currCount--;
            }
            if(nums[end % nums.length]==0){
                currCount++;
            }
            minCount = Math.min(minCount,currCount);
            start++;end++;
        }
        return minCount;
    }
}