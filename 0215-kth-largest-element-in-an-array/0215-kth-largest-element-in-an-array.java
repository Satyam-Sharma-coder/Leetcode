class Solution {
    public static int getPivotElement(int[] nums, int L, int R){
        int pvt = nums[L];
        int i = L+1;
        int j = R;

        while(i<=j){
            if(nums[i] < pvt && nums[j] > pvt){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }if(nums[i] >= pvt){
                i++;
            }
            if(nums[j] <= pvt){
                j--;
            }
        }
        int temp = nums[L];
        nums[L] = nums[j];
        nums[j] = temp;
        return j;
    }
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        int L = 0;
        int R = n-1;
        int pivotIndex = 0;

        while(true){
            pivotIndex = getPivotElement(nums,L,R);
            if(pivotIndex== k-1){
                break;
            }
            else if(pivotIndex > k-1){
                R = pivotIndex -1;
            }
            else{
                L = pivotIndex + 1;
            }
        }
        return nums[pivotIndex];
    }
}