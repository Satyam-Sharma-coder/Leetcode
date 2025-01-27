class Solution {
    public int minIncrementForUnique(int[] nums) {
        int max=0;
        for(int num: nums){
            max=Math.max(max,num);
        }
        int[] arr = new int[nums.length+max];
        for(int num: nums){
            arr[num]++;
        }
        int moves=0;
        for(int i=0;i<nums.length+max;i++){
            if(arr[i]>1){
                int extra = arr[i]-1;
                arr[i+1] += extra;
                arr[i]=1;
                moves += extra;
            }
        }
        return moves;
    }
}