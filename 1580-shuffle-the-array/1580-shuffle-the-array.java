class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[nums.length];
        int k;
        int i=0;
        int j=n;
        for(k=0;k<nums.length-1;k+=2){
            arr[k]=nums[i++];
            arr[k+1]=nums[j++];
        }
        return arr;
    }
}