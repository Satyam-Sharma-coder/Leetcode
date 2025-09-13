class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        int maxv=Math.max(freq[0],Math.max(freq[4],Math.max(freq[8],Math.max(freq[14],freq[20]))));
        int maxc=0;
        for(int i=0;i<26;i++){
            if(i==0 || i==4 || i==8 || i==14 || i==20){
                continue;
            }
            maxc=Math.max(maxc,freq[i]);
        }
        return maxc+maxv;

    }
}