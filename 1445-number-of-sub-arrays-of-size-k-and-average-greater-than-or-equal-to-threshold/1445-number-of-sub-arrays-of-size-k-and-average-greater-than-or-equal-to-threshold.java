class Solution {
    public int numOfSubarrays(int[] nums, int k, int threshold) {
        threshold = threshold*k;
        int i =0;
        int j = 0;
        int sum = 0;
        int count =0;
        for(j=0;j<k;j++){
            sum += nums[j];
        }
        if(sum >= threshold){
            count++;
        }


        while(j<nums.length){
            sum = sum - nums[i]+nums[j];
            if(sum >= threshold){
                count++;
            }
            i++;j++;
        }
        return count;
    }
}