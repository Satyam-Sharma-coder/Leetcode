class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr=new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for(String s: words){
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<s.length();i++){
                sb.append(arr[s.charAt(i)-'a']);
            }
            set.add(sb.toString());
        }
        System.out.println(set);
        return set.size();
    }
}