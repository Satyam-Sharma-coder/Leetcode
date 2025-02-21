class Solution {
    public static void reverse(char[] arr,int s,int e){
        while(s<=e){
            char temp = arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        int i;
        for(i=0;i<arr.length;i++){
            if(arr[i]==ch){
                break;
            }
        }
        if(i==arr.length) return word;
        reverse(arr, 0,i);
        return new String(arr);

    }
}