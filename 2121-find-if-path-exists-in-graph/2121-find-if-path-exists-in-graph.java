class Solution {
    public boolean union(int x, int y, int[]rank, int[] parent){
        int parent_x = findRoot(x,parent);
        int parent_y = findRoot(y,parent);
        if(parent_x==parent_y) return false;

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
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        int[] parent = new int[n];
        int[] rank = new int[n];

        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        for(int [] edge: edges){
            union(edge[0],edge[1],rank,parent);
        }
        return findRoot(source,parent)==findRoot(destination,parent);
    }
}