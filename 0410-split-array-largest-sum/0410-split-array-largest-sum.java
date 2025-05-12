class Solution {
    public boolean isPossible(int[] nums,int k,int mid){
        k--;
        int sum=0;
        for(int i:nums){
            if(i > mid) return false;
            if(sum+i>mid){
                k--;
                sum =0;
            }
            sum +=i;
        }
        return k>=0;

    }
    public int splitArray(int[] nums, int k) {
        
        int min=Integer.MAX_VALUE;
        int max=0;
        for(int i:nums){
            min=Math.min(min,i);
            max+=i;
        }
        int ans=0;
        while(min<=max){
            int mid=(min+max)/2;
            if(isPossible(nums,k,mid)){
                ans=mid;
                max = mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return ans;
    }
}