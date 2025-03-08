class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum = n*(n+1)/2;
        int curr = 0;
        for(int i:nums){
            curr += i;
        }
        return sum-curr;
    }
}