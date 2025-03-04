class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr = new int[10001];
        int[] arr2 = new int[10001];
        int count=0;
        for(int i:nums1){
            arr[i]++;
        }
        for(int i:nums2){
            arr2[i]++;
        }
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0 && arr2[i]!=0){
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