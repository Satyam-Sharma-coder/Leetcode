class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0;
        int m1=-1;
        int count2=0;
        int m2=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==m1) count1++;
            else if(nums[i]==m2) count2++;
            else if(count1==0){
                m1=nums[i];
                count1++;
            }
            else if(count2==0){
                m2=nums[i];
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> list = new ArrayList<>();
        int v1=0;
        int v2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==m1) v1++;
            else if(nums[i]==m2) v2++;
        }
        if(v1>nums.length/3) list.add(m1);
        if(v2>nums.length/3) list.add(m2);
        return list;
    }
}