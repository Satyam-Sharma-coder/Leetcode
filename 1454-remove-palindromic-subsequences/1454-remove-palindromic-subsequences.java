class Solution {
    public boolean isPalindrome(String s){
        int start =0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;end--;
        }
        return true;
    }
    public int removePalindromeSub(String s) {
        boolean res = isPalindrome(s);
        if(res) return 1;
        return 2;
    }
}