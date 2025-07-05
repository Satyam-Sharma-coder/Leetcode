class Solution {
    int[] connection;
     public int find(int x, int[]parent){
        if(x==parent[x]) return x;
        return parent[x]=find(parent[x],parent);
    }
    public void union(int x,int y,int[] parent,int[] rank){
        int parent_x = find(x,parent);
        int parent_y=find(y,parent);
        if(parent_x==parent_y) return;
        int rank_x=rank[parent_x];
        int rank_y=rank[parent_y];
        if(rank_x > rank_y){
            parent[parent_y] = parent_x;
            connection[parent_x] += connection[parent_y];
        }
        else if(rank_y > rank_x){
            parent[parent_x] = parent_y;
            connection[parent_y] += connection[parent_x];
        }
        else{
            parent[parent_y] = parent_x;
            rank[parent_x]++;
            connection[parent_x] += connection[parent_y];
        }
    }
    public long countPairs(int n, int[][] edges) {
        int[] parent=new int[n];
        int[] rank=new int[n];
        connection=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
            connection[i]=1;
        }
        for(int[] edge: edges){
            int x= edge[0];
            int y= edge[1];
            union(x,y,parent,rank);
        }
        int unconnected = 0;
        for(int i=0;i<n;i++){
            if (parent[i]==i){
                unconnected++;
            }
        }
        if(unconnected==1) return 0;
        int[] ans = new int[unconnected];
        int p=0;
        for(int i=0;i<n;i++){
            if (parent[i]==i){
                ans[p++]=connection[i];
            }
        }
        long val=0;
        int remaining=n;
        for(int i=0;i<p;i++){
            System.out.println(ans[i]);
            int size=ans[i];
            val += (long)size * (remaining-size);
            remaining=(remaining-size);
        }
        return val;

    }
}