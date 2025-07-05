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
        }
        else if(rank_y > rank_x){
            parent[parent_x] = parent_y;
        }
        else{
            parent[parent_y] = parent_x;
            rank[parent_x]++;
        }
    }
    public long countPairs(int n, int[][] edges) {
        int[] parent=new int[n];
        int[] rank=new int[n];
        for(int i=0;i<n;i++){
            parent[i]=i;
        }
        for(int[] edge: edges){
            int x= edge[0];
            int y= edge[1];
            union(x,y,parent,rank);
        }

        Map<Integer,Long> map= new HashMap<>();
        for(int i=0;i<n;i++){
            int component=find(i,parent);
            map.put(component,map.getOrDefault(component,0L)+1);
        }
        long rem=n;
        long ans=0;
        for(Map.Entry<Integer,Long> entry: map.entrySet()){
            Long size=entry.getValue();
            ans += size *(rem-size);
            rem= rem-size;
        }
        return ans;
    }
}