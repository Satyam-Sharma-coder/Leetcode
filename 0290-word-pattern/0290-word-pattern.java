class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        String[] st = s.split(" ");
        if (pattern.length() != st.length) {
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
                if(!map.get(pattern.charAt(i)).equals(st[i])){
                    return false;
                }
            }else{
                if(map.containsValue(st[i])){
                    return false;
                }
                map.put(pattern.charAt(i),st[i]);
            }
        }
        return true;
    }
}