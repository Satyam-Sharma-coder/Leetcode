class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0) return false;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : hand){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Arrays.sort(hand);
        int ans = 0;
        for(int h : hand){
            int i;
            int count=0;
            for(i = 0; i < groupSize; i++){
               if(map.containsKey(h + i) && map.get(h + i)>0){
                 count++;
               }else{
                break;
               }
            }
            if(count==groupSize){
                for(i = 0; i < groupSize; i++){
                  map.put(h + i, map.getOrDefault((h + i),0) - 1);
               }
            }
        }
        for(int i: hand){
            if(map.get(i)!=0){
                return false;
            }
        }
        return true;
    }
}