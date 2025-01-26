class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int w = m+n-1;
        while(w >=0){
            if(i>=0 && j>=0){
                nums1[w] = nums1[i]>nums2[j]?nums1[i--]:nums2[j--];

            }else if(i >= 0){
                nums1[w]=nums1[i--];
            }else{
                nums1[w]=nums2[j--];
            }
            w--;
        }
    }
}
