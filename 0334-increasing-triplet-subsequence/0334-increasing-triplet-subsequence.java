class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n=nums.length;
        int num1=Integer.MAX_VALUE,num2=Integer.MAX_VALUE,num3;
        for(int i=0;i<n;i++){
            num3=nums[i];
            if(num1>=num3){
                num1=num3;
            }
            else if(num2>=num3){
                num2=num3;
            }
            else{
                return true;
            }
        }
        return false;
    }
}