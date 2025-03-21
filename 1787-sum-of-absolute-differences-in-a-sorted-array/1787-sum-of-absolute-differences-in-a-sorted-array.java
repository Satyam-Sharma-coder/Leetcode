class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int[] arr1=new int[nums.length];
        int[] arr2=new int[nums.length];
        int[] ans=new int[nums.length];
        arr1[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr1[i]=nums[i]+arr1[i-1];
        }
        arr2[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            arr2[i]=nums[i]+arr2[i+1];
        }
        for(int i=0;i<nums.length;i++){
            int left=(nums[i]*i)-arr1[i];
            int right=arr2[i]-(nums[i]*(nums.length-i-1));
            ans[i]=left+right;
        }
        return ans;
    }
}