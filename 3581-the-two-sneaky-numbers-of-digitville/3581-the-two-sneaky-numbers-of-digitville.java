class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n=nums.length;
        int[] ans=new int[2];
        int[] freq=new int[n];
        for(int i:nums){
            freq[i]++;
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(freq[i]==2){
                ans[j++]=i;
            }
        }
        return ans;
    }
}