class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int r=0;
        for(int i=0;i<nums.length;i++){
            r+=nums[i];
            int l=nums[i];
            nums[i]=Math.abs(sum-r);
            sum-=l;
        }
        return nums;
    }
}