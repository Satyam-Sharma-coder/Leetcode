class Solution {
    public int maxFrequencyElements(int[] nums) {
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int[] freq=new int[max+1];
        for(int i:nums){
            freq[i]++;
        }
        int maxf=0;
        for(int i=0;i<freq.length;i++){
            if(maxf<freq[i]){
                maxf=freq[i];
            }
        }
        int ans=0;
        for(int i:freq){
            if(i==maxf){
                ans+=i;
            }
        }
        return ans;
    }
}