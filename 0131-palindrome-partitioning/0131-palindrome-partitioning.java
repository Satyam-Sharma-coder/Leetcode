class Solution {
    List<List<String>> ans = new ArrayList<>();

    public boolean ispalindrome(int start,int end,String s){
        if(start==end) return true;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public void helper(int start,String s,List<String> temp){
        if(start==s.length()){
            ans.add(new ArrayList<>(temp));
            return; 
        }
        for(int i=start;i<s.length();i++){
            if(ispalindrome(start,i,s)){
                temp.add(s.substring(start,i+1));
                helper(i+1,s,temp);
                temp.remove(temp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        helper(0,s,new ArrayList<>());
        return ans;
    }
}