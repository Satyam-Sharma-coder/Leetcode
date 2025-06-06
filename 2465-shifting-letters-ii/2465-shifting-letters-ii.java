class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] arr = new int[n];
        StringBuilder sb = new StringBuilder();

        for(int[] val: shifts){
            int st = val[0];
            int e = val[1];
            int x = val[2]==1?1:-1;
            arr[st]+= x;
            if(e+1<n) arr[e+1]-=x;
        }
        for(int i=1;i<n;i++){
            arr[i]+=arr[i-1];
        }
        for(int i=0;i<n;i++){
            int shift = arr[i]%26<0?(arr[i]%26)+26:arr[i]%26;
            char curr =(char) (((s.charAt(i)-'a')+shift)%26+'a');
            sb.append(curr);
        }
        return sb.toString();
    }
}