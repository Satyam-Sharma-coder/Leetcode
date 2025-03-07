class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new HashMap<>();
        if(names.length!=heights.length);
        for(int i=0;i<names.length;i++){
            map.put(heights[i],names[i]);
        }
        String[] ans = new String[names.length];
        Arrays.sort(heights);
        int k=0;
        for(int i=heights.length-1;i>=0;i--){
            String val = map.get(heights[i]);
            ans[k++]=val;
        }
        return ans;
    }
}