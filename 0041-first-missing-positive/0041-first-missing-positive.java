class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        boolean one = false;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                one=true;
            }
            if(nums[i]<1 || nums[i]>n){
                nums[i]=1;
            }
        }
        if(!one) return 1;

        for(int i=0;i<n;i++){
            int  val = Math.abs(nums[i]);
            int index = val-1;
            if(nums[index]>0){
                nums[index]=-nums[index];
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}