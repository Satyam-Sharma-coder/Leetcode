class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int start = 0;
        int end = 1;
        int ans = 0;
        int ans2=0;
        while(end<2*colors.length){
            if(colors[(end-1)% colors.length]==colors[(end)% colors.length]){
                start = end;
            }
            else if (colors[(end-1)%colors.length]!=colors[end % colors.length] && end-start+1>=k){
                ans++;
            }
            if(end== colors.length-1){
                ans2=ans;
            }
            end++;
        }
        return ans-ans2;
    }
}