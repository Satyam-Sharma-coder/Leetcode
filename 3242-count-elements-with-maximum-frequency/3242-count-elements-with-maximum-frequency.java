class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] freq=new int[101];
        for(int i:nums){
            freq[i]++;
        }
        int maxf=0;
        for(int i=0;i<freq.length;i++){
            maxf=Math.max(maxf,freq[i]);
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