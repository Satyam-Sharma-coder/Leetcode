class Solution {
    public int countLargestGroup(int n) {
        int[] count = new int[40];
        int ans=0;
        int max=0;
        for (int i=1;i<=n;++i) {
            int sum=0;
            for (int j=i;j>0;j/=10) {
                sum+=j%10;
            }
            ++count[sum];
            if (max<count[sum]) {
                max=count[sum];
                ans=1;
            } else if(max==count[sum]){
                ++ans;
            }
        }
        return ans;
    }
}