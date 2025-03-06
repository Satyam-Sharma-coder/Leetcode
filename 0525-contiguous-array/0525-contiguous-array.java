class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int max=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i]==0?-1:1;
            if(map.containsKey(sum)){
                int start = map.get(sum);
                max=Math.max(max,i-start);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return max;
    }
}