class Solution {
    public int minSwaps(int[] nums) {
        int ones = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                ones++;
            }
        }
        int minCount = Integer.MAX_VALUE;
        int currcount=0;
        int start = 0;
        int end = ones;
        for(int i=0;i<ones;i++){
            if(nums[i]==0){
                currcount ++;
            }
        }
        minCount = Math.min(minCount,currcount);
        while(end<nums.length+ones){
            if(nums[start%nums.length]==0){
                currcount--;
            }
            if(nums[end%nums.length]==0){
                currcount++;
            }
            minCount = Math.min(minCount,currcount);
            start++;end++;
        }
        return minCount;
    }
}