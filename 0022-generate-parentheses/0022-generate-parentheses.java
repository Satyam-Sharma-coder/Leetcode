class Solution {
    public void helper(int i,int j,int n, String s,List<String> ans){
        if(s.length()==2*n){
            ans.add(s);
        }
        if(i<n){
            helper(i+1,j,n,s+"(",ans);
        }
        if(j<i){
            helper(i,j+1,n,s+")",ans);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        helper(0,0,n,"",ans);
        return ans;
    }
}