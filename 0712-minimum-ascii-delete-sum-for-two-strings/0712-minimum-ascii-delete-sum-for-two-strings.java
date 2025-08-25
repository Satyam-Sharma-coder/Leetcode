class Solution {
    public int helper(String s1, String s2,int i,int j,int[][] dp){
        if(s1.substring(i).equals(s2.substring(j))){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }

        if(i>s1.length()-1){
            int val=0;
            for(int k=j;k<s2.length();k++){
                char ch = s2.charAt(k);
                val=val+ch;
            }
            return dp[i][j]=val;
        }
        if(j>s2.length()-1){
            int val=0;
            for(int k=i;k<s1.length();k++){
                char ch = s1.charAt(k);
                val=val+ch;
            }
            return dp[i][j]=val;
        }
        int val=0;
        if(s1.charAt(i)==s2.charAt(j)){
            val=helper(s1,s2,i+1,j+1,dp);
        }else{
            int d1=s1.charAt(i)+helper(s1,s2,i+1,j,dp);
            int d2=s2.charAt(j)+helper(s1,s2,i,j+1,dp);
            val=Math.min(d1,d2);
        }
        return dp[i][j]=val;
    }
    public int minimumDeleteSum(String s1, String s2) {
        int[][] dp=new int[s1.length()+1][s2.length()+1];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        int ans=helper(s1,s2,0,0,dp);
        return ans;
    }
}