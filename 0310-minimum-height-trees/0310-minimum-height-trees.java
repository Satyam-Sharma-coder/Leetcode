class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n<=2){
            List<Integer> ans=new ArrayList<>();
            for(int i=0;i<n;i++){
                ans.add(i);
            }
            return ans;
        }
        List<Integer>[] graph = new List[n];
        for(int i=0;i<n;i++){
            graph[i]=new LinkedList<>();
        }
        for(int[] arr: edges){
            graph[arr[0]].add(arr[1]);
            graph[arr[1]].add(arr[0]);
        }

        List<Integer> leaves = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(graph[i].size()==1){
                leaves.add(i);
            }
        }
        int rem=n;
        while(rem>2){
            List<Integer> newleaves=new ArrayList<>();
            for(int leaf: leaves){
                int node=graph[leaf].get(0);
                graph[node].remove((Object) leaf);

                if(graph[node].size()==1){
                    newleaves.add(node);
                }
            }
            rem-=leaves.size();
            leaves=newleaves;
        }
        return leaves;

    }
}