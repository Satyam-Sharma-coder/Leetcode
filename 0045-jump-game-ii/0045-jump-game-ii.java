class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int l=0,r=0,f=0;
        int jump=0;
        while(r<n-1){
            f=0;
            for(int i=l;i<=r;i++){
                f=Math.max(f,i+nums[i]);
            }
            l=r+1;
            r=f;
            jump++;
        }
        return jump;
    }
}