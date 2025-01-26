class Solution {
    public int appendCharacters(String s, String t) {
        int spointer = 0;
        int tpointer = 0;
        while(spointer<s.length()){
            if(tpointer==t.length()) return 0;
            else if(s.charAt(spointer)!=t.charAt(tpointer)) spointer++;
            else{
                spointer++;
                tpointer++;
            }
        }
        return t.length()-tpointer; 
    }
}