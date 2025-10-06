class Solution {
    public int dfs(int u,boolean[] visited,List<Integer>[] graph){
        visited[u]=true;
        int count=1;

        for(int v: graph[u]){
            if(!visited[v]){
                count+=dfs(v,visited,graph);
            }
        }
        return count;
    }
    public int maximumDetonation(int[][] bomb) {
        int  length= bomb.length;
        int maxa=0;
        List<Integer>[] graph=new List[length];

        for(int i=0;i<length;i++){
            graph[i]= new ArrayList<Integer>();
        }




        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++){
                if(i!=j){
                    int x1=bomb[i][0];
                    int y1=bomb[i][1];
                    int r=bomb[i][2];
                    int x2=bomb[j][0];
                    int y2=bomb[j][1];

                    if ((long)(x1-x2)*(x1-x2)+(long)(y1-y2)*(y1-y2) <= (long)r*r) {
                        graph[i].add(j);
                    }
                }
            }
        }

        for(int i=0;i<length;i++){
            int count = dfs(i,new boolean[length],graph);
            maxa=Math.max(maxa,count);
        }
        return maxa;


    }
}


