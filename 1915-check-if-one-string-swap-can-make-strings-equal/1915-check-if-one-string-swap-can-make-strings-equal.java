class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int count=0;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            arr1[s1.charAt(i)-'a']++;
            arr2[s2.charAt(i)-'a']++;
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
            if(count>2){
                return false;
            }
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}