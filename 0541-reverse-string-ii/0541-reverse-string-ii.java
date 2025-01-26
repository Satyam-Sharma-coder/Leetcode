class Solution {
    public void reverse(char[] res,int i,int j){
        while(i<j){
            char temp = res[i];
            res[i]=res[j];
            res[j]=temp;
            i++;j--;
        }
    }
    public String reverseStr(String s, int k) {
        char[] res = s.toCharArray();
        int i=0;
        while(i<res.length){
            int j=Math.min(res.length-1,i+k-1);
            reverse(res,i,j);
            i += 2*k;
        }
        return new String(res);
    }
}