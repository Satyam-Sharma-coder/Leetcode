class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i+=2){
            int val=nums[i+1];
            int count=0;
            while(count++<nums[i]){
                list.add(val);
            }
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}