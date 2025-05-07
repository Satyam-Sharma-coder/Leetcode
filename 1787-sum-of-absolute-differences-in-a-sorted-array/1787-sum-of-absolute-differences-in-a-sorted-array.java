class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int num: nums){
            sum += num;
        }
        int ps=0;

        int result[] = new int[n];
        for(int i=0;i<n;i++){
            result[i]=(nums[i]*i)-ps+(sum-ps-nums[i])-(nums[i]*(n-i-1));
            ps += nums[i];
        }
        return result;
    }
}