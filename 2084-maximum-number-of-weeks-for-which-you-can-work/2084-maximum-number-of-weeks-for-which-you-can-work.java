class Solution {
    public long numberOfWeeks(int[] milestones) {
        int n =milestones.length;
        long sum=0;
        int mx=0;
        for(int i=0;i<n;i++){
            mx=Math.max(mx,milestones[i]);
            sum += milestones[i];
        }
        if(mx> sum-mx) return 2*(sum-mx)+1;
        return sum;
    }
}