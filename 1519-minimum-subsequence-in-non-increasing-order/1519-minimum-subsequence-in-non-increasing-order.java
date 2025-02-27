class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        List<Integer>arr=new ArrayList<>();
        int currSum=0;
        for(int i=nums.length-1;i>=0;i--){
            sum-=nums[i];
            currSum+=nums[i];
            if(currSum>sum){
                arr.add(nums[i]);
                break;
            }
            arr.add(nums[i]);
        }
        return arr;
    }
}