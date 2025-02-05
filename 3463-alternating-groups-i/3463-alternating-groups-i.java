class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int start=0;
        int end=1;
        int k=3;
        int ans1=0;
        int ans2=0;
        while(end<2*colors.length){
            if(colors[(end-1)%colors.length]==colors[(end)%colors.length]){
                start=end;
            }
            else if(colors[(end-1)%colors.length]!=colors[(end)%colors.length] && end-start+1>=k){
                ans1++;
            }
            if(end==colors.length-1){
                ans2=ans1;
            }
            end++;
        }
        return ans1-ans2;
    }
}