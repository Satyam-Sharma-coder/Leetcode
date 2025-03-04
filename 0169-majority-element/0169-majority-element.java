class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                int freq = map.get(nums[i]);
                if(freq>=nums.length/2){
                    return nums[i];
                }
                map.put(nums[i],freq+1);
            }
        }
        return nums[0];
    }
}