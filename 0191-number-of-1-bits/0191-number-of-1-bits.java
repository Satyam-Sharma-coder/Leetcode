class Solution {
    public int hammingWeight(int n) {
        int count=0;
        while(n>0){
            int rem = n%2;
            count += rem;
            n=n >> 1;
        }
        return count;
    }
}