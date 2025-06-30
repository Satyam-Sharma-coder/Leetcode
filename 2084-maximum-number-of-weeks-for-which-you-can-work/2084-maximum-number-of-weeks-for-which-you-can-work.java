class Solution {
    public long numberOfWeeks(int[] milestones) {
        Arrays.sort(milestones);
        if (milestones.length==1) return milestones[0]==0?0:1;
        long sum=0;
        for(int i=0;i<milestones.length-1;i++){
            sum +=milestones[i];
        }
        if(milestones[milestones.length-1]>sum){
            return 2*(sum)+1;
        }
        return sum+milestones[milestones.length-1];
    }
}