class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int start=0;
        int end = tokens.length-1;
        int count=0;
        int max=0;
        while(start<end){
            if(tokens[start]<=power){
                power -= tokens[start];
                start++;
                count++;
                max=Math.max(max,count);
            }
            else{
                power += tokens[end];
                if(count==0){
                    return 0;
                }
                end--;
                count--;
                max=Math.max(max,count);
            }
        }
        if(start==end){
        if(tokens[start]<=power){
            count++;
            max=Math.max(max,count);
            }
        }
        return count;
    }
}