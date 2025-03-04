class Solution {
    public int majorityElement(int[] nums) {
        int m=-1;
        int curr=0;
        for(int i=0;i<nums.length;i++){
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