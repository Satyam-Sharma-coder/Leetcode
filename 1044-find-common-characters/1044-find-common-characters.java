class Solution {
    public List<String> commonChars(String[] words) {
        Map<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<words[0].length();i++){
            map.put(words[0].charAt(i),map.getOrDefault(words[0].charAt(i),0)+1);
        }
        for(int i=1;i<words.length;i++){
            Map<Character,Integer> map2 = new HashMap<>();

            for(int j=0;j<words[i].length();j++){
                map2.put(words[i].charAt(j), map2.getOrDefault(words[i].charAt(j),0)+1);
            }
            for(char ch: map.keySet()){
                if(map2.containsKey(ch)){
                    map.put(ch,Math.min(map.get(ch),map2.get(ch)));
                }else{
                    map.put(ch,0);
                }
            }
        }

        List<String> list = new ArrayList<>();
        for(char ch: map.keySet()){
            int freq = map.get(ch);
            for(int i=0;i<freq;i++){
                list.add(String.valueOf(ch));
            }
        }
        return list;
    }
}