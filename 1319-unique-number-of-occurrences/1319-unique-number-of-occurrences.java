class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] nums = new int[2001];
        for(int num: arr){
            nums[num+1000]++;
        }
        Arrays.sort(nums);
        for(int i=1;i<2001;i++){
            if(nums[i]!=0 && nums[i]==nums[i-1]){
                return false;
            }
        }
        return true;
    }
}