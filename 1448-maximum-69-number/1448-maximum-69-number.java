class Solution {
    public int maximum69Number (int n) {
        int reverse=0;
        while(n%10>0){
            int val=n%10;
            reverse=reverse*10+val;
            n=n/10;
        }
        boolean change=false;
        int ans=0;
        while(reverse%10>0){
            int val=reverse%10;
            if(val==6 && !change){
                val=9;
                change=true;
            }
            ans=ans*10+val;
            reverse=reverse/10;
        }
        return ans;
    }
}