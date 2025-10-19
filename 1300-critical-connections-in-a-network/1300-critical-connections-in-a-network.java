class Solution {
    List<Integer>[] graph;
    boolean[] visited;
    int[] lowTime;
    int[] visitedTime;
    List<List<Integer>> ans;
    int time=0;

    public void dfs(int curr, int parent){
        visited[curr]=true;
        lowTime[curr]=time;
        visitedTime[curr]=time;
        time++;

        for(int next: graph[curr]){
            if(next==parent) continue;
            if(!visited[next]){
                dfs(next,curr);
                lowTime[curr] = Math.min(lowTime[curr], lowTime[next]);
                if (lowTime[next] > visitedTime[curr]) {
                    ans.add(Arrays.asList(curr, next));
                }
            }else {
                lowTime[curr] = Math.min(lowTime[curr], visitedTime[next]);
            }
        }
        

    }
    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        graph = new List[n];
        visited = new boolean[n];
        lowTime = new int[n];
        visitedTime = new int[n];
        ans=new ArrayList<>();

        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }


        for(List<Integer> edge: connections){
            int u=edge.get(0);
            int v=edge.get(1);
            graph[u].add(v);
            graph[v].add(u);
        }



        dfs(0,-1);
        return ans;


    }
}



//make  graph
// make visited boolean array
// make lowtime array and vitedtime array
// time=0 global declare
// dfs curr=0 parent=-1
//mark curr as  visited  
//assign low= time and vist=time
// time++
// visit  next node if not visited
// next!= prent -> next visited? next and curr ka min jayega curr low time -> curr=next , parent=curr 
// on backtract compare lowtime of curr and parent keep minimum lowtime and check currlowtime<= parent VisitedTime if not make it critical




