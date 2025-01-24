class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int unsatisfied = 0;
        for(int i=0;i<minutes;i++){
            unsatisfied += customers[i] * grumpy[i];
            
        }
        int maxUnsatisfied = unsatisfied;
        int start = 0;
        int end = minutes;
        while(end < grumpy.length){
            unsatisfied = unsatisfied - (customers[start] * grumpy[start]) + (customers[end] * grumpy[end]);
            maxUnsatisfied = Math.max(maxUnsatisfied,unsatisfied);
            start++;end++;
            
        }
        int satisfied=0;
        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i]==0){
                satisfied += customers[i];
            }  
        }
        return maxUnsatisfied+satisfied;
    }
}