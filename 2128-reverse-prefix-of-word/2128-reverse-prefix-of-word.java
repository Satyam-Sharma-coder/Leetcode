class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder res = new StringBuilder();
        for(int i=0;i<word.length();i++){
            res.insert(0,word.charAt(i));
            if(word.charAt(i)==ch){
                res.append(word.substring(i+1,word.length()));
                return res.toString();
            }
        }
        return word;
    }
}