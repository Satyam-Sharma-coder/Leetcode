class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int a=0;
        int b=0;
        Stack<Integer> st = new Stack<>();

        while(a<pushed.length && b<popped.length){
            st.push(pushed[a++]);
            while(!st.isEmpty() && st.peek()==popped[b]){
                st.pop();
                b++;
            }
        }
        return st.isEmpty();
    }
}