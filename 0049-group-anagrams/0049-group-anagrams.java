class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] freq = new char[26];
            for(char c: s.toCharArray()){
                freq[c-'a']++;
            }
            String key = Arrays.toString(freq);

            if(map.containsKey(key)){
                List<String> list = map.get(key);
                list.add(s);
                map.put(key,list);

            }else{
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(key,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}