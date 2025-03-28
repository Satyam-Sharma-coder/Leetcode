class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // Handle cases where subarray starts from index 0
        int sum = 0;
        
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int mod = sum % k;
            if (mod < 0) mod += k;
            if (map.containsKey(mod)) {
                if (i - map.get(mod) >= 2) return true;
            } else {
                map.put(mod, i);
            }
        }
        return false;
    }
}