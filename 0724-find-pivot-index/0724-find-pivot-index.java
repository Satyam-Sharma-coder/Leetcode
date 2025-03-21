class Solution {
    public int pivotIndex(int[] nums) {
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum==nums[0]) return 0;
        int r=0;
        int l=sum-nums[r];
        if(l==r) return 1;
        for(int i=1;i<nums.length;i++){
            r+=nums[i-1];
            l=l-nums[i];
            if(r==l){
                return i;
            }
        }


    
        return -1;
    }
}