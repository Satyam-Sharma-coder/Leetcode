class Solution {
    public int helper(String word1, String word2,int i,int j,int[][] dp){
        if(i>=word1.length()) return word2.length()-j;
        if(j>=word2.length()) return word1.length()-i;
        if(dp[i][j]!=-1) return dp[i][j];
        if(word1.charAt(i)==word2.charAt(j)) return helper(word1,word2,i+1,j+1,dp);
        int a=helper(word1,word2,i+1,j+1,dp);
        int b=helper(word1,word2,i,j+1,dp);
        int c=helper(word1,word2,i+1,j,dp);
        return dp[i][j]=1+Math.min(a,Math.min(b,c));
    }
    public int minDistance(String word1, String word2) {
        int[][] dp=new int[word1.length()][word2.length()];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return helper(word1,word2,0,0,dp);
    }
}