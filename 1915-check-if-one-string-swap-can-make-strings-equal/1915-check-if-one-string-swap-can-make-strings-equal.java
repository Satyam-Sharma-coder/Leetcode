class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.length()!=s2.length()) return false;
        int count=0;
        int diff1=0;
        int diff2=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
                if(count>2){
                return false;
                }
                if(count==1){
                    diff1=i;
                }
                else if(count==2){
                    diff2=i;
                }
            }
        }
        if((s1.charAt(diff1)!=s2.charAt(diff2) || s1.charAt(diff2)!=s2.charAt(diff1)) || count==1) return false;
        return true;
    }
}