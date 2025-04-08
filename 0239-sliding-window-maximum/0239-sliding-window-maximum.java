class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[n-k+1];
        int p=0;
        for(int i=0;i<n;i++){
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.addLast(i);
            if(i>=k-1){
                if(dq.peekFirst()>=i-k+1 && dq.peekFirst()<=i){
                    ans[p++]=nums[dq.peek()];
                }else{
                    dq.removeFirst();
                    ans[p++]=nums[dq.peekFirst()];
                }
            }
        }
        return ans;

    }
}