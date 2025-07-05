class Solution {
    public int find(int x, int[]parent){
        if(x==parent[x]) return x;
        return parent[x]=find(parent[x],parent);
    }
    public boolean union(int x,int y,int[] parent,int[] rank){
        int parent_x = find(x,parent);
        int parent_y=find(y,parent);
        if(parent_x==parent_y) return false;
        int rank_x=rank[parent_x];
        int rank_y=rank[parent_y];
        if(rank_x>rank_y){
            parent[parent_y]= parent_x;
            return true;
        }
        else if(rank_y>rank_x){
            parent[parent_x]=parent_y;
            return true;
        }
        else{
            parent[parent_y]=parent_x;
            rank[parent_x]++;
            return true;
        }
    }
    public int makeConnected(int n, int[][] connections) {
        int[] parent=new int[n];
        int[] rank= new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        int cables=0;
        for(int[] edges:connections){
            int x=edges[0];
            int y=edges[1];
            if(!union(x,y,parent,rank)) cables++;
        }
        int count=0;
        for(int i=0;i<n;i++){
            System.out.println(i+" "+parent[i]);
            if(parent[i]==i){
                count++;
            }
        }
        if(cables>=count-1){
            return count-1;
        }
        return -1;
    }
}