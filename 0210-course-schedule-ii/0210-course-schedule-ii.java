class Solution {
    public int[] findOrder(int V, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        
        // declare arraylist of adjacent nodes
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        
        // indegree of nodes(incoming nodes)
        int[] indgree = new int[V];
        
        //inset adjacent nodes 
        for(int[] edge: edges){
            int u = edge[0];
            int v =edge[1];
            adj.get(v).add(u);
            indgree[u]++;             // update indegee val
        }
        
        //declare queue for nodes having indegree 0
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indgree[i]==0){
                q.add(i);
            }
        }
        
        
        //
        ArrayList<Integer> ans = new ArrayList<>();
        
        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);
            for(int Adj: adj.get(node)){
                indgree[Adj]--;
                if(indgree[Adj]==0){
                    q.add(Adj);
                }
            }
        }
        int[] arr = new int[ans.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=ans.get(i);
        }
        if(arr.length!=V) return new int[0];
        return arr;
    }
}