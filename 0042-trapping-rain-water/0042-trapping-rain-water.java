class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length-1;
        int lm=0;
        int rm =0;
        int tap=0;
        while(l<r){
            if(height[l]<height[r]){
                lm = Math.max(lm,height[l]);
                if(lm>=height[l]){
                tap +=lm-height[l];
            }
                l++;

            }else{
                rm = Math.max(rm,height[r]);
                if(rm>=height[r]){
                tap +=rm-height[r];
            }
                r--;
            }

        }
        return tap;
    }
}