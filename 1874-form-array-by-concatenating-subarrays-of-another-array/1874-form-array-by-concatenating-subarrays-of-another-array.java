class Solution {
    public int matchGroup(int[] group, int[] nums,int index){
        for(int i=index;i<=nums.length-group.length;i++){
            boolean match=true;
            for(int j=0;j<group.length;j++){
                if(group[j]!=nums[i+j]){
                    match=false;
                    break;
                }
            }
            if(match){
                return i;
            }
        }
        return -1;
    }
    public boolean canChoose(int[][] groups, int[] nums) {
        int index=0;
        for(int[] group:groups){
            index = matchGroup(group,nums,index);
            if(index<0){
                return false;
            }
            index += group.length; 
        }
        return true;
    }
}