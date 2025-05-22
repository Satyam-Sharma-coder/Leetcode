class Solution {
    public boolean isPossible(int[] bloomDay, int m, int k, int mid){
        int count=0,ans=0;
        for(int i: bloomDay){
            if(i<=mid){
                count++;
                if(count==k){
                ans++;
                count=0;
                }
            }
            else{
                count=0;
            }
            
        }
        return ans>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i: bloomDay){
            max=Math.max(i,max);
            min = Math.min(i,min);
        }
        int ans=-1;
        while(min<=max){
            int mid = (min+max)/2;
            if(isPossible(bloomDay,m,k,mid)){
                ans=mid;
                max=mid-1;
            }else{
                min = mid+1;
            }
        }
        return ans;
    }
}