class Solution {
    public int[] diStringMatch(String s) {
        int[] res =new int[s.length()+1];
        int start = 0;
        int end = s.length();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I') res[j++]= start++;
            else res[j++] = end--;
        }
        if(s.length()-1=='I') res[j]=start;
        else res[j]=end;
        return res;
        
    }
}