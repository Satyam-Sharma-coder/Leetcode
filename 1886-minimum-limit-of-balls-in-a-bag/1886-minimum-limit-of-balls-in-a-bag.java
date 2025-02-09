class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int min=1;
        int max=nums[0];
        for(int i: nums){
            max=Math.max(max,i);
        }
        int mid=0;
        while(min<=max){
            mid = (min+max)/2;
            if(isPossible(nums, mid, maxOperations)){
                max = mid-1;
            }
            else{
                min = mid+1;
            }
        }
        return min;
    }
    public static boolean isPossible(int[] nums, int mid, int maxOperations){
        
            for(int sp: nums){
                int opr = 0;
                if(sp > mid){
                    if(sp%mid == 0){
                        opr = sp/mid;
                        opr -= 1;
                    }
                    else{
                        opr = sp/mid;
                    }
                    maxOperations -= opr;
                }
            }
            return maxOperations>=0;
        }
}