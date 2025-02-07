class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer> ball = new HashMap<>();
        HashMap<Integer,Integer> color = new HashMap<>();
        int[] res = new int[queries.length];

        for(int i=0;i<queries.length;i++){
            int b= queries[i][0];
            int c= queries[i][1];
            if(ball.containsKey(b)){
                int prevcolor = ball.get(b);
                color.put(prevcolor, color.get(prevcolor)-1);
                if(color.get(prevcolor)==0){
                    color.remove(prevcolor);
                }
            }
            ball.put(b,c);
            color.put(c, color.getOrDefault(c,0)+1);
            res[i]=color.size();
        }
        return res;
    }
}