class Solution {
    static int[] ans = new int[2];
    public boolean union(int x, int y, int[]rank, int[] parent){
        int parent_x = findRoot(x,parent);
        int parent_y = findRoot(y,parent);
        if(parent_x==parent_y){
            ans[0]=x;
            ans[1]=y;
            return false;
        }

        int rank_x = rank[parent_x];
        int rank_y = rank[parent_y];

        if(rank_x > rank_y){
            parent[parent_y]=parent_x;

        }
        else if(rank_y>rank_x){
            parent[parent_x]=parent_y;
        }
        else{
            parent[parent_x]=parent_y;
            rank[parent_y]++;
        }
        return true;
    }
    public int findRoot(int x,int[] parent){
        if(x==parent[x]){
            return x;
        }
        return parent[x]=findRoot(parent[x],parent);
    }
    public int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[edges.length+1];
        int[] rank = new int[edges.length+1];

        for(int i=1;i<edges.length+1;i++){
            parent[i]=i;
        }
        for(int [] edge: edges){
            
            union(edge[0],edge[1],rank,parent);
        }
        return ans;
    }
}