class Solution {
    public long maxRunTime(int n, int[] batteries) {
        long min=0;
        long max = 0;
        for(int i : batteries){
            min = Math.min(min,i);
            max += i;
        }
        while(min <= max){
            long mid = (min + max)/2;
            long val = mid * n;
            if(isPossible(batteries, mid, val)){
                min = mid + 1;
            }
            else{
                max = mid - 1;
            }
        }
        return max;
    }
    public boolean isPossible(int[] batteries, long mid, long val){
        long sum=0;
        for(int i: batteries){
            long use = Math.min(i,mid);
            sum += use;
        }
        return sum >= val;
    }
}