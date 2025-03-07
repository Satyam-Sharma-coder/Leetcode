class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        int count=0;
        for(int i=0;i<allowed.length();i++){
            set.add(allowed.charAt(i));
        }
        for (String word : words) {
            Set<Character> set2 = new HashSet<>();
            for (char ch : word.toCharArray()) {
                set2.add(ch);
            }
            if (set.containsAll(set2)) count++;
        }
        return count;
    }
}