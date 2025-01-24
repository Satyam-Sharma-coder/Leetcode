class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int start = 0;
        int end = 0;
        int cost =0;
        int maxLength =0;
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        while( end < s1.length){
            cost += Math.abs(s1[end] - s2[end]);
            while(cost > maxCost){
                cost -= Math.abs(s1[start] - s2[start]);
                start++;
            }
            maxLength = Math.max(maxLength, end - start +1);
            end++;
        }
        return maxLength;
    }
}