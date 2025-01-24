class Solution {
    public int longestOnes(int[] nums, int k) {
        int i =0;
        int j =0;
        int count = 0;
        int length = 0;
        while(j<nums.length){
            if(nums[j]==0){
                count++;
            }
            j++;
            while(count>k){
                if(nums[i]== 0){
                    count--;
                }
                i++;
            }
            length = Math.max(length, j - i);
        }
        return length;
    }
}