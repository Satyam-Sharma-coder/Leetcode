class Solution {
    public int pivotIndex(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum==nums[0]) return 0;
        int r=0;
        sum-=nums[r];
        if(sum==r) return 1;
        for(int i=1;i<nums.length;i++){
            r+=nums[i-1];
            sum-=nums[i];
            if(r==sum){
                return i;
            }
        }

        return -1;
    }
}