import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 
        int sum = 0, ans = 0;
        for (int num : nums) {
            sum += num;
            int rem = sum % k;
            if (rem < 0) {
                rem += k;
            }
            ans += map.getOrDefault(rem, 0);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return ans;
    }
}
