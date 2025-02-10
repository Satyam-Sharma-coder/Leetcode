class Solution {
    public static boolean isPossible(int[] nums,int mid,int p){
        int currp=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-nums[i-1]<=mid){
                currp++;
                i++;
            }
        }
        return currp>=p;
    }
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int min=0;
        int max=nums[nums.length-1]-nums[0];
        int ans=0;
        while(min<=max){
            int mid = (min+max)/2;
            if(isPossible(nums,mid,p)){
                ans=mid;
                max=mid-1;
            }
            else{
                min=mid+1;
            }
        }
        return ans;
    }
}