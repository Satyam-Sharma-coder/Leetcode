class Solution {
    public void reverse(char[] arr,int start,int end){
        while(start<end){
            char temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        reverse(arr,0,arr.length-1);
        int l=0;
        int r=0;
        int i=0;
        while(i<arr.length){
            while(i<arr.length && arr[i]!=' '){
                arr[r++]= arr[i++];
            }
            if(l<r){
                reverse(arr, l, r - 1);
                if (r < arr.length) { 
                    arr[r++] = ' ';
                }
                l=r;
            }
            i++;

        }
        return new String(arr, 0, r - (r > 0 && arr[r - 1] == ' ' ? 1 : 0));
    }
}