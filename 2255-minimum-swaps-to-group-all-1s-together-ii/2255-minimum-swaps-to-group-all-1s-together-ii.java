class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int onces = 0;
        for(int i:nums){
            if (i==1) onces++;
        }
        int s=0;
        int e=0;
        int count=0;
        int mx=Integer.MAX_VALUE;
        while(e<n+onces){
            if(nums[e%n]==0) count++;
            if(e-s+1==onces){
                mx=Math.min(count,mx);
                if(nums[s%n]==0) count--;
                s++;
            }
            e++;
        }
        return mx==Integer.MAX_VALUE?0:mx;
    }
}