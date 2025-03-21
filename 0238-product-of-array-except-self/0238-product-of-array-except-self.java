class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr1=new int[nums.length];
        arr1[0]=1;
        for(int i=1;i<nums.length;i++){
            arr1[i]=nums[i-1]*arr1[i-1];
        }
        int p=nums[nums.length-1];
        nums[nums.length-1]=1*arr1[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            int tp=p;
            p*=nums[i];
            nums[i]=arr1[i]*tp;
        }
        return nums;


        
    }
}