class Solution {
    public void helper(int i,int j,int n, StringBuilder s,List<String> ans){
        if(s.length()==2*n){
            ans.add(s.toString());
        }
        if(i<n){
            s.append("(");
            helper(i+1,j,n,s,ans);
            s.deleteCharAt(s.length()-1);
        }
        if(j<i){
            s.append(")");
            helper(i,j+1,n,s,ans);
            s.deleteCharAt(s.length()-1);
        }

    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        StringBuilder s=new  StringBuilder();
        helper(0,0,n,s,ans);
        return ans;
    }
}