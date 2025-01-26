class Solution {
    public String reverseOnlyLetters(String s) {
        char[] res = s.toCharArray();
        int start=0;
        int end = res.length-1;
        while(start<end){
            if(!Character.isLetter(res[start])) start++;
            else if(!Character.isLetter(res[end])) end--;
            else{
                char temp = res[start];
                res[start]=res[end];
                res[end]=temp;
                start++;end--;
            }
        }
        return new String(res);
    }
}