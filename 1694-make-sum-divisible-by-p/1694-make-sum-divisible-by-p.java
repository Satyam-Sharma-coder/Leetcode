class Solution {
    public int minSubarray(int[] nums, int k) {
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, -1); 
        
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        
        long need = totalSum % k;
        if (need == 0) return 0; 
        
        long prefixSum = 0;
        int minLen = nums.length;
        
        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            long remainder = (prefixSum % k + k) % k;
            long target = (remainder - need + k) % k;
            
            if (map.containsKey(target)) {
                minLen = Math.min(minLen, i - map.get(target));
            }
            
            map.put(remainder, i);
        }
        
        return minLen == nums.length ? -1 : minLen;
    }
}
