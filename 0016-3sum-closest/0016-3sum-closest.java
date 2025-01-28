class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = Integer.MAX_VALUE;
        for(int k=0;k<nums.length-2;k++){
            int i=k+1;
            int j=nums.length-1;
            while(i<j){
                int sum = nums[i]+nums[j]+nums[k];
                if(Math.abs(target-sum)<Math.abs(target-ans)){
                    ans = sum;
                }
                if(sum<target) i++;
                else j--;
            }
        }
        return ans;
    }
}