class Solution {
    public int minOperations(int[] nums, int x) {
        x=-x;
        for(int i: nums){
            x += i;
        }
        if(x<0){
            return -1;
        }
        if(x==0){
            return nums.length;
        }
        int start = 0;
        int end =0;
        int ml = 0;
        while(end < nums.length){
            x -= nums[end];
            while(x<0){
                x += nums[start];
                start++;
            }
            if(x==0){
                ml = Math.max(ml,end-start+1);
            }
            end++;
        }
        if(ml==0){
            return -1;
        }
        return nums.length-ml;
    }
}