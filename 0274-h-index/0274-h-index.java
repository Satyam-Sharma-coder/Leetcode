class Solution {
    public int hIndex(int[] citations) {
        int[] arr = new int[citations.length+1];
        for(int i=0;i<citations.length;i++){
            if(citations[i]> citations.length){
                arr[arr.length-1]++;
            }
            else{
                arr[citations[i]]++;
            }
        }
        int count = 0;
        for(int i=arr.length-1;i>=0;i--){
            count += arr[i];
            if(count >= i){
                return i;
            }
        }
        return 0;
    }
}