class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n= nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];
        int[] ans = new int[n-k+1];

        for(int i=0;i<n;i++){
            if(i%k==0){
                leftSum[i] = nums[i];
            }
            else{
                leftSum[i] = Math.max(leftSum[i-1],nums[i]);
            }
        }
        for(int i=n-1;i>=0;i--){
            if(((i+1)%k==0) || i==n-1){
                rightSum[i] = nums[i];
            }
            else{
                rightSum[i] = Math.max(rightSum[i+1],nums[i]);
            }
        }
        int i=0;
        int j = i+k-1;
        while(j<n){
            ans[i]=Math.max(leftSum[j],rightSum[i]);
            i++;j++;
        }
        return ans;

    }
}