class Solution {
    public int[] shuffle(int[] nums, int n) {
        int val = 1001;

        for(int i=0;i<n;i++){
            nums[i+n]= nums[i+n] + (nums[i]*val);
        }

        
        for(int i=0;i<n;i++){
            nums[2*i]=nums[i+n]/val;
            nums[2*i+1]=nums[i+n]%val;
        }
        return nums;
    }
}