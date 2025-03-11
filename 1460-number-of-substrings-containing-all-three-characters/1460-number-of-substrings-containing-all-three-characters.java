class Solution {
    public int numberOfSubstrings(String s) {
        int a = -1, b= -1, c=-1;
        int start = 0;
        int count = 0;
        while(start<s.length()){
            if(s.charAt(start)=='a') a = start;
            else if(s.charAt(start)=='b') b = start;
            else c=start;
            if(a>=0 && b >= 0 && c>= 0){
                count += Math.min(a,Math.min(b,c))+1;
            }
            start++;
        }
        return count;
    }
}