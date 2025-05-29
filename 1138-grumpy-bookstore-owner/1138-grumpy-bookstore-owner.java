class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int s=0;
        int e=0;
        int us=0;
        int mx=0;
        int sf=0;
        while(e<grumpy.length){
            sf += grumpy[e]==0?customers[e]:0;
            if(e-s+1>minutes){
                us -= grumpy[s]*customers[s];
                s++;
            }
            us += grumpy[e]*customers[e];
            mx= Math.max(mx,us);
            e++;
        }
        return mx+sf;
    }
}