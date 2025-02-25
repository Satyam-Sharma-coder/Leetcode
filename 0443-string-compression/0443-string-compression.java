class Solution {
    public int compress(char[] chars) {
        int k = 0;
        int i = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;
            while (i < chars.length && chars[i] == currentChar) {
                count++;
                i++;
            }
            chars[k++] = currentChar;
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[k++] = c;
                }
            }
        }
        return k;
    }
}