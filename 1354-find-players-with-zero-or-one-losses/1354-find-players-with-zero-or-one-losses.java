class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<matches.length;i++){
            map.put(matches[i][1],map.getOrDefault(matches[i][1],0)+1);
        }
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i=0;i<matches.length;i++){
            if(!map.containsKey(matches[i][0])){
                list.add(matches[i][0]);
                map.put(matches[i][0],2);
            }
            int freq = map.get(matches[i][1]);
            if(freq==1){
                list2.add(matches[i][1]);
            }
        }
        Collections.sort(list);
        Collections.sort(list2);
        ans.add(list);
        ans.add(list2);
        return ans;
    }
}