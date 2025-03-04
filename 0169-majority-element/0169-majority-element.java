class Solution {
    public int majorityElement(int[] nums) {
        int m=nums[0];
        int curr=1;
        for(int i=1;i<nums.length;i++){
            if(curr==0){
                m=nums[i];
            }
            if(nums[i]!= m){
                curr--;
            }
            else{
                curr++;
            }
        }
        return m;
    }
}