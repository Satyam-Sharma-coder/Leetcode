class Solution {
    public String minWindow(String s, String t) {
        int[] t1 = new int[128];
        int[] s1 = new int[128]; 

        for (int i = 0; i < t.length(); i++) {
            t1[t.charAt(i)]++;
        }
        int count = 0;
        for (int i = 0; i < 128; i++) {
            if (t1[i] != 0) count++;
        }
        int start = 0, end = 0, minLength = s.length() + 1;
        int si = -1, ei = -1;
        while (end < s.length()) {
            s1[s.charAt(end)]++;
            
            if (s1[s.charAt(end)] == t1[s.charAt(end)]) {
                count--;
            }
            while (start <= end && count == 0) {
                if (minLength > end - start + 1) {
                    minLength = end - start + 1;
                    si = start;
                    ei = end;
                }
                s1[s.charAt(start)]--;
                if (s1[s.charAt(start)] < t1[s.charAt(start)]) {
                    count++;
                }
                start++;
            }

            end++;
        }
        return (si == -1) ? "" : s.substring(si, ei + 1);
    }
}
