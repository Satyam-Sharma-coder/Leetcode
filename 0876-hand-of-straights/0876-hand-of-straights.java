class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {

        if(hand.length % groupSize!=0) return false;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<hand.length;i++){
            map.put(hand[i],map.getOrDefault(hand[i],0)+1);
        }


        Arrays.sort(hand);
        for(int i=0;i<hand.length;i++){
            int first=hand[i];
            int j=1;
            int k=-1;
            while(j!=groupSize && map.get(hand[i])!=0){
                if(map.containsKey(hand[i]+k) && map.get(hand[i]+k)!=0){
                    j++;
                    k--;
                }
                else{
                    break;
                }
            }
            if(j==groupSize){
                    j=0;
                    k=0;
                    while(j!=groupSize){
                        map.put(hand[i]+k,map.getOrDefault(hand[i]+k,0)-1);
                        j++;
                        k--;
                    }
            }
        }
        for(int i=0;i<hand.length;i++){
            if(map.containsKey(hand[i])){
                if(map.get(hand[i])!=0){
                    return false;
                }
            }
        }
        return true;
    }
}