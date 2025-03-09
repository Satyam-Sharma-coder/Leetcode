class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] arr = new int[k];
        int sum = 0, ans = 0;
        arr[0]=1;
        for (int num : nums) {
            sum = (num+sum) % k;
            if (sum < 0) sum += k;
            ans += arr[sum];
            arr[sum]++;
            
        }
        return ans;
    }
}
