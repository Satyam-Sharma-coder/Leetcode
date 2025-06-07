class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Integer> st = new Stack();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(st.size()>0){
                    sb.append(s.charAt(i));
                }
                st.push(1);
            }
            else{
                st.pop();
                if(st.size()>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}