class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            int req = sum -k;
            if(map.containsKey(req)){
                ans += map.get(req);
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}