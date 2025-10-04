class Solution {
    public boolean dfs(int u,boolean[] visited,boolean[] explored, List<List<Integer>> adj){
        if(visited[u]==true && explored[u]==false){
            return false;
        }
        visited[u]=true;

        for(int v: adj.get(u)){
            if(!explored[u] && !dfs(v,visited,explored,adj)){
                return false;
            }
        }
        explored[u]=true;
        return true;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] arr: prerequisites){
            int v=arr[0];
            int u=arr[1];
            adj.get(u).add(v);
        }

        boolean[] visited=new boolean[numCourses];
        boolean[] explored=new boolean[numCourses];

        for(int i=0;i<numCourses;i++){
            if(!visited[i]){
                if(!dfs(i,visited,explored,adj)){
                    return false;
                }
            }
        }
        return true;

    }
}