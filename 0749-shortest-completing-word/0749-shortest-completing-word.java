class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character,Integer> map = new HashMap<>();
        licensePlate=licensePlate.toLowerCase();
        for(int i=0;i<licensePlate.length();i++){
            if(licensePlate.charAt(i)>='a' && licensePlate.charAt(i)<='z'){
                map.put(licensePlate.charAt(i),map.getOrDefault(licensePlate.charAt(i),0)+1);
            }
        }
        String result = null;
        for(String s: words){
            Map<Character,Integer> map2 = new HashMap<>();
            for(int i=0;i<s.length();i++){
                map2.put(s.charAt(i), map2.getOrDefault(s.charAt(i),0)+1);
            }
            boolean isValid = true;
            for (char c : map.keySet()) {
                if (map2.getOrDefault(c, 0) < map.get(c)) {
                    isValid = false;
                    break;
                }
            }
            if (isValid && (result == null || s.length() < result.length())) {
                result = s;
            }
        }
        return result;
    }
}