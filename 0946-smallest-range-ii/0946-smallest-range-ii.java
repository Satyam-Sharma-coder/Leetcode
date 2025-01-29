class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int bestL = nums[0]+k;
        int bestR = nums[nums.length-1]-k;
        int res=nums[nums.length-1]-nums[0];
        int i=0;
        for(i=0;i<nums.length-1;i++){
            int min=Math.min(bestL,nums[i+1]-k);
            int max=Math.max(bestR,nums[i]+k);
            res=Math.min(max-min,res);
        }
        return res;
    }
}