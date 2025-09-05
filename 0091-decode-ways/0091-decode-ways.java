class Solution {
    public int helper(String s,int i,int[] dp){
        if(i>=s.length()) return 1;
        if(i==s.length()-1 && s.charAt(i)=='0') return 0;
        if(i==s.length()-1 && s.charAt(i)!='0') return 1;
        if(s.charAt(i)=='0') return 0;
        if(dp[i]!=-1) return dp[i];
        if(s.charAt(i)=='1'){
            return dp[i]=helper(s,i+2,dp)+helper(s,i+1,dp);
        }
        else if(s.charAt(i)=='2'){
            if(i+1<s.length() && s.charAt(i+1)>='0' && s.charAt(i+1)<='6'){
                return dp[i]=helper(s,i+2,dp)+helper(s,i+1,dp);
            }
        }
        return dp[i]=helper(s,i+1,dp);
        
    }
    public int numDecodings(String s) {
        int[]dp = new int[s.length()];
        Arrays.fill(dp,-1);
        return helper(s,0,dp);
    }
}