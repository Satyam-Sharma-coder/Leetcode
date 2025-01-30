class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[128];
        int start = 0;
        int end = 0;
        int maxLength = 0;
        while(end<s.length()){
            freq[s.charAt(end)]++;
            while(freq[s.charAt(end)]>1 && start < end){
                freq[s.charAt(start)]--;
                start++;
            }
            maxLength = Math.max(maxLength, end-start+1);
            end++;
        }
        return maxLength;
    }
}