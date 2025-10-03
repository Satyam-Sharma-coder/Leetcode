class Solution {
    public int findJudge(int n, int[][] trust) {
        if(trust.length == 0 && n == 1 ) return 1 ; 
        if(trust.length == 0 && n > 1 ) return -1 ; 
        HashMap<Integer,HashSet<Integer>> map = new HashMap<>() ; 
        Set<Integer> set = new HashSet<>();

        for ( int i = 0 ; i < trust.length ; i++ ) {
            int a = trust[i][0] ; 
            int b = trust[i][1] ; 
            set.add(a);

            if(map.containsKey(b)) {
                map.get(b).add(a) ; 
            }
            else {
                map.put(b,new HashSet<>()) ; 
                map.get(b).add(a);
            }

        }
        for(int val: map.keySet()){
            if(set.contains(val)) continue ; 
            HashSet<Integer> s= map.get(val);
            if(s.size()==n-1){
                return val;
            }
        }
        return -1;
    }
}