class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        int[] nums = new int[n];
        Arrays.fill(nums, Integer.MAX_VALUE);
        nums[src]=0;

        while(k>=0){
            int[] temp=Arrays.copyOf(nums,n);

            for(int[] f: flights){
                int u=f[0];
                int v=f[1];
                int p=f[2];

                if(nums[u]!=Integer.MAX_VALUE){
                    if(temp[v]> nums[u]+p){
                        temp[v]=nums[u]+p;
                    }
                }
            }
            k--;
            nums=temp;
        }
        return nums[dst]==Integer.MAX_VALUE?-1:nums[dst];
    }
}