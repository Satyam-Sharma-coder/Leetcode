class Solution {
    public int maxScore(String s) {
        int arr1[]=new int[s.length()];
        int arr2[]=new int[s.length()];
        arr1[0]=s.charAt(0)=='0'?1:0;
        arr2[s.length()-1]=s.charAt(s.length()-1)=='1'?1:0;
        for(int i=1;i<s.length();i++){
            arr1[i]=s.charAt(i)=='0'?arr1[i-1]+1:arr1[i-1];
        }
        for(int i=s.length()-2;i>=0;i--){
            arr2[i]=s.charAt(i)=='1'?arr2[i+1]+1:arr2[i+1];
        }
        int max=0;
        for(int i=0;i<s.length()-1;i++){
            max = Math.max(max,arr1[i]+arr2[i+1]);
        }
        return max;
    }
}