class Solution {
    public int find(int x, int[]parent){
        if(x==parent[x]) return x;
        return parent[x]=find(parent[x],parent);
    }
    public void union(int x,int y,int[] parent,int[] rank){
        int parent_x = find(x,parent);
        int parent_y=find(y,parent);
        if(parent_x==parent_y);
        int rank_x=rank[parent_x];
        int rank_y=rank[parent_y];
        if(rank_x>rank_y){
            parent[parent_y]= parent_x;
        }
        else if(rank_y>rank_x){
            parent[parent_x]=parent_y;
        }
        else{
            parent[parent_y]=parent_x;
            rank[parent_x]++;
        }
    }
    public int makeConnected(int n, int[][] connections) {
        int[] parent=new int[n];
        int[] rank= new int[n];
        if(connections.length <n-1) return -1;
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        for(int[] edges:connections){
            int x=edges[0];
            int y=edges[1];
            union(x,y,parent,rank);
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(parent[i]==i){
                count++;
            }
        }
        return count-1;
    }
}