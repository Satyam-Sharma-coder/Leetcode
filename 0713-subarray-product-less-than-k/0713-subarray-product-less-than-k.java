class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int i =0;
        int j = 0;
        int count = 0;
        int product = 1;
        while(j<nums.length){
            product *= nums[j];
            while(i<=j && product>=k){
                product /= nums[i];
                i++;
            }
            count += j-i+1;
            j++;
        }
        return count;
    }
}