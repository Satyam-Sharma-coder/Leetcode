class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        int sum=0;
        for(String s: operations){
            if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("D")){
                st.push(st.peek()*2);
            }
            else if(s.equals("+")){
                if(st.size()>1){
                    int top=st.pop();
                    int sumv = st.peek()+top;
                    st.push(top);
                    st.push(sumv);
                }
            }
            else{
                int val = Integer.parseInt(s);
                st.push(val);
            }
        }
        while(!st.isEmpty()){
            sum += st.pop();
        }
        return sum;
    }
}