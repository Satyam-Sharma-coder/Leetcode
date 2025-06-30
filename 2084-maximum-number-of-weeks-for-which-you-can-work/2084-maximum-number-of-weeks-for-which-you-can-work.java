class Solution {
    public long numberOfWeeks(int[] milestones) {
        Arrays.sort(milestones);
        if (milestones.length==1) return milestones[0]==0?0:1;
        long sum=0;
        for(int i=0;i<milestones.length;i++){
            sum +=milestones[i];
        }
        System.out.println(sum);
        System.out.println(milestones[milestones.length-1]);
        if(milestones[milestones.length-1]>sum-milestones[milestones.length-1]){
            return 2*(sum-milestones[milestones.length-1])+1;
        }
        return sum;
    }
}