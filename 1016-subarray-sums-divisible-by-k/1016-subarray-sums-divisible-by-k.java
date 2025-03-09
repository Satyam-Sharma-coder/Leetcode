import java.util.HashMap;
import java.util.Map;

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 
        int sum = 0, ans = 0;
        for (int num : nums) {
            sum += num;
            sum = sum % k;
            if (sum < 0) {
                sum += k;
            }
            ans += map.getOrDefault(sum, 0);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
