class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr = new int[10001];
        for(int i:nums1){
            arr[i]=1;
        }
        int count=0;
        for(int i:nums2){
            if(arr[i]==2) continue;
            if(arr[i]!=0){
                arr[i]=2;
                count++;
            }
        }
        int[] res = new int[count];
        int k=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                res[k++]=i;
            }
        }
        return res;
    }
}