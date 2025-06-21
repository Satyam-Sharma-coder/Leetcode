class Solution {
    public String modifyString(String s) {
        char c1 ='a';
        char c2='b';
        char c3='c';
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='?') sb.append(s.charAt(i));
            else{
                char start = i-1>=0?sb.charAt(sb.length()-1):'?';
                char end = i+1 < s.length()?s.charAt(i+1):'?';
                if(start!=c1 && end!=c1){
                    sb.append(c1);
                }
                else if(start!=c2 && end!=c2){
                    sb.append(c2);
                }else{
                    sb.append(c3);
                }
            }
        }
        return sb.toString();

    }
}