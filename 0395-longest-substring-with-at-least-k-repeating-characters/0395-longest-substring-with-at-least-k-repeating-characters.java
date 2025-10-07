class Solution {
    public boolean validfq(String s,int k){
        int[] freqt= new int[26];
        for(char ch: s.toCharArray()){
            freqt[ch-'a']++;
        }
        for(char ch: s.toCharArray()){
            if(freqt[ch-'a']<k){
                return false;
            }
        }
        return true;
        
    }
    public int longestSubstring(String s, int k) {
        int[] freqt= new int[26];

        for(char ch: s.toCharArray()){
            freqt[ch-'a']++;
        }

        int start=0;
        int end=0;
        int maxl=0;

        while(end<s.length()){

            if(freqt[s.charAt(end)-'a']<k){
                start=end+1;
                end=end+1;
                continue;
            }
            int sq=start;
            while(sq<=end){
                if(validfq(s.substring(sq,end+1),k)) maxl=Math.max(maxl,end-sq+1);
                sq++;
            }
            
            end++;
        }
        return maxl;
    }
}