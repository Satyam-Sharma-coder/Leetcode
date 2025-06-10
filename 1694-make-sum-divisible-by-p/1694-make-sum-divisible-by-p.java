class Solution {
    public int minSubarray(int[] nums, int k) {
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L, -1); 
        long c = 0;
        for (int num : nums) {
            c += (long) num;
        }
        long need = c % k;
        if (need == 0) return 0; 
        long sum = 0;
        int minL = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            long want = (sum - need);
            want = (want + k) % k;  
            if (map.containsKey(want)) {
                minL = Math.min(minL, i - map.get(want));
            }
            map.put(sum % k, i);
        }
        return minL == nums.length ? -1 : minL;
    }
}
