class Solution {
    public boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public int maxVowels(String s, int k) {
        int start = 0;
        int end = k;
        int count  = 0;
        for(int i=0;i<end;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        int maxCount = count;
        while(end < s.length()){
            if(isVowel(s.charAt(start))){
                count--;
            }
            if(isVowel(s.charAt(end))){
                count++;
            }
            maxCount = Math.max(maxCount,count);
            start++;end++;
        }
        return maxCount;
    }
}