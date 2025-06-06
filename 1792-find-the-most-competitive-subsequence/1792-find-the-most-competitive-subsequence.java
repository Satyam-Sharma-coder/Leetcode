class Solution {
    public int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[k];
        k=nums.length-k;

        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty() && nums[i]<st.peek() && k-->0){
                st.pop();
            }
            st.push(nums[i]);
        }
        while(k-->0){
            st.pop();
        }
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;
    }
}