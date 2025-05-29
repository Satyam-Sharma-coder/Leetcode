class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int s=0,e=0,us=0,mx=0,sf=0;
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