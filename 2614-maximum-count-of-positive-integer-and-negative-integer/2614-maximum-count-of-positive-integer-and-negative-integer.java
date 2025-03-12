class Solution {
    public int maximumCount(int[] nums) {
        int minc=0;
        int maxc=0;
        for(int num: nums){
            if(num<0) minc++;
            else if(num>0) maxc++;
        }
        return Math.max(minc,maxc);
    }
}