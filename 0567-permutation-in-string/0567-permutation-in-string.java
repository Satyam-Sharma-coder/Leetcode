class Solution {
    public boolean isPermutation(int[] freqs1,int[] freqs2){
        for(int i=0;i<freqs2.length;i++){
            if(freqs1[i]!=freqs2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length()<s1.length()) return false;



        int[] freqs1 = new int[26];
        int[] freqs2 = new int[26];
        for(int i=0;i<s1.length();i++){
            freqs1[s1.charAt(i)-'a']++;
        }

        int k = s1.length();
        int i=0;
        int j=0;
        while(j<s2.length()){
            freqs2[s2.charAt(j)-'a']++;
            if(j-i+1 == k){
                if(isPermutation(freqs1,freqs2)){
                    return true;
                }
                freqs2[s2.charAt(i)-'a']--;
                i++;
            }
            j++;
        }
        return false;
    }
}