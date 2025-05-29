class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int s=0,e=0,us=0,mx=0,sf=0;
        while(e<grumpy.length){
            sf += grumpy[e]==0?customers[e]:0;
            us += grumpy[e]*customers[e];
            if(e-s+1==minutes){
                mx= Math.max(mx,us);
                us -= grumpy[s]*customers[s];
                s++;
            }
            e++;
        }
        return mx+sf;
    }
}