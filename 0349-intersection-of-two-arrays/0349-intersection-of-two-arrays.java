class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> s = new HashSet<>();
        for(int i: nums1){
            s.add(i);
        }
        Set<Integer> s2 = new HashSet<>();
        for(int i: nums2){
            s2.add(i);
        }
        List<Integer> ans = new ArrayList<>();
        for(int i: s2){
            if(s.contains(i)){
                ans.add(i);
            }
        }
        int[] res = new int[ans.size()];
        for(int i=0;i<res.length;i++){
            res[i]=ans.get(i);
        }
        return res;
    }
}