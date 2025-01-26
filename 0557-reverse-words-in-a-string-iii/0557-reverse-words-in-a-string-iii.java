class Solution {
    public void reverse(char[] res,int start,int end){
        while(start<end){
            char temp = res[start];
            res[start] = res[end];
            res[end] = temp;
            start++;end--;
        }
    }
    public String reverseWords(String s) {
        char[] res = s.toCharArray();
        int start = 0;
        int end =0;
        while(end<=res.length){
            if(end == res.length || res[end] == ' '){
                reverse(res,start,end-1);
                start = end+1;
            }
            end++;
        }
        return new String(res);
    }
}