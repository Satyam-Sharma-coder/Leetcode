class Solution {
    public String customSortString(String order, String s) {
        Map<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<order.length();i++){
            if(map.containsKey(order.charAt(i))){
                int count = map.get(order.charAt(i));
                for (int j = 0; j < count; j++) {
                    sb.append(order.charAt(i));
                }
                map.remove(order.charAt(i));
            }
        }
        for (char c : map.keySet()) {
            int count = map.get(c);
            for (int j = 0; j < count; j++) {
                sb.append(c);
            }
        }
        return new String(sb);
    }
}