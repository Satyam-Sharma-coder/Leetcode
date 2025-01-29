class Solution {
    public int smallestRangeII(int[] nums, int k) {
        Arrays.sort(nums);
        int bestL = nums[0]+k;
        int bestR = nums[nums.length-1]-k;
        int min=Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        int res=nums[nums.length-1]-nums[0];
        for(int i=0;i<nums.length-1;i++){
            min=Math.min(bestL,nums[i+1]-k);
            max=Math.max(bestR,nums[i]+k);
            res=Math.min(max-min,res);
        }
        return res;
    }
}