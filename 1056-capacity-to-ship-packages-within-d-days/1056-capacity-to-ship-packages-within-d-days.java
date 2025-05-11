class Solution {
    public int shipWithinDays(int[] weights, int days) {
        if(days > weights.length) return -1;
        int min = 0;
        int max = 0;
        for(int i: weights){
            min = Math.max(min, i);
            max += i;
        }
        int ans = 0;
        while(min <= max){
            int mid = (min + max)/2;
            if(isPossible(weights,mid,days)){
                ans = mid;
                max = mid - 1;
            }
            else{
                min = mid + 1;
            }
        }
        return ans;
    }
    public static boolean isPossible(int[] weights, int mid, int days){
        int capacity = 0;
        days--;
        for(int i: weights){
            capacity += i;
            if(capacity > mid){
                days--;
                capacity = i;
            }
        }
        return days>=0;
    }
}