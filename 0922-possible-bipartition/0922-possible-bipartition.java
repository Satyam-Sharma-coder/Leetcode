class Solution {
    public boolean dfs(int u,int[] partition,List<List<Integer>> adj){
        for(int v: adj.get(u)){
            if(partition[v]==-1){
                partition[v]=1-partition[u];
                if(!dfs(v,partition,adj)){
                    return false;
                }
            }
            else if(partition[u]==partition[v]){
                return  false;
            }
        }
        return true;
    }
    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] arr: dislikes){
            int u=arr[0];
            int v=arr[1];

            adj.get(u).add(v);
            adj.get(v).add(u);
        }

        int[] partiton= new int[n+1];
        Arrays.fill(partiton, -1);



        for(int u=1;u<=n;u++){
            if(partiton[u]==-1){
                partiton[u]=0;
                if(!dfs(u,partiton,adj)){
                    return false;
                }
            }
        }
        return true;
    }
}