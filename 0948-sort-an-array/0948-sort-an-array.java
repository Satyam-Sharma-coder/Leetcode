class Solution {
    public void merge(int[]nums,int s,int m,int e){
        int n1 = m-s+1;
        int n2=e-m;
        int[] arr1 = new int[n1];
        int[] arr2= new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i]=nums[s+i];
        }
        for(int i=0;i<n2;i++){
            arr2[i]=nums[m+1+i];
        }
        int i=0;
        int j=0;
        int k=s;
        while(k<=e){
            if(i<n1 && j<n2){
                if(arr1[i]<=arr2[j]){
                nums[k++]=arr1[i++];
            }
                else{
                    nums[k++]=arr2[j++];
                }
            }
            else if(i<n1){
                nums[k++]=arr1[i++];
            }
            else{
                nums[k++]=arr2[j++];
            }
        }
    }
    public void mergeSort(int[]nums,int s,int e){
        if(s<e){
            int mid=(s+e)/2;
            mergeSort(nums,s,mid);
            mergeSort(nums,mid+1,e);
            merge(nums,s,mid,e);
        }

    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}