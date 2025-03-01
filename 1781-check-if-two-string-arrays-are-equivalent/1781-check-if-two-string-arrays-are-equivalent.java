class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        char[] arr1 = String.join("", word1).toCharArray();
        char[] arr2 = String.join("", word2).toCharArray();
        if(arr1.length != arr2.length) return false;
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}