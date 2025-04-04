class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[prices.length];
        for(int i=prices.length-1;i>=0;i--){
            while(!st.isEmpty() && prices[i]<st.peek()){
                st.pop();
            }
            if(!st.isEmpty()){
                int p =st.peek();
                ans[i]=prices[i]-p;
            }else{
                ans[i]=prices[i];
            }
            st.push(prices[i]);
        }
        return ans;
    }
}