class Solution {
    public int[] diStringMatch(String s) {
        int[] res =new int[s.length()+1];
        int start = 0;
        int end = s.length();
        int j=0;
        while(j<res.length){
            if(j==res.length-1){
                if(s.charAt(j-1)=='D'){
                res[j]= end;
                }
                else{
                    res[j]=start;
                }
                break;
            }
            if(s.charAt(j)=='D'){
                res[j]= end;
                end--;
            }
            else{
                res[j]=start;
                start++;
            }
            j++;
        }
        return res;
        
    }
}