class Solution {
    public boolean nextgreater(int n){
        int[] nums=new int[10];
        while(n>0){
            int val=n%10;
            if(val==0) return false;
            nums[val]++;
            n=n/10;
        }

        for(int i=1;i<10;i++){
            if(nums[i]>0 && nums[i]!=i){
                return false;
            }
        }
        return true;
    }
    public int nextBeautifulNumber(int n) {
        for(int i=n+1;i<=1224444;i++){
            if(nextgreater(i)){
                return i;
            }
        }
        return 0;
    }
}