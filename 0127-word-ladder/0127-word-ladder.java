class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int n = wordList.size();
        int[] dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        List<Integer>[] graph = new List[n+1];
        int src=0;
        int dest=-1;

        for(int i=0;i<n+1;i++){
            graph[i]= new ArrayList<Integer>();
        }
        for(int i=0;i<n+1;i++){
            String u = "";
            if(i==0){
                u=beginWord;
            }
            else{
                u=wordList.get(i-1);
            }
            if(u.equals(endWord)){
                dest=i;
            }
            if(u.equals(beginWord)){
                src=i;
            }


            for(int j=0;j<n;j++){
                String v = wordList.get(j);
                if(u.length()!=v.length()){
                    continue;
                }
                int count=0;

                for(int k=0;k<v.length();k++){
                    if(u.charAt(k)!=v.charAt(k)){
                        count++;
                    }
                }
                if(count==1){
                    graph[i].add(j+1);
                }
            }

        }


        for(int i=0;i<n+1;i++){
            System.out.print(i+"---->");
            for(int j=0;j<graph[i].size();j++){
                System.out.print(graph[i].get(j)+" ");
            }
            System.out.println();
        }
        if(dest==-1) return 0;

        dist[src]=1;
        System.out.println(src+" "+dest);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[1]-b[1]);
        pq.add(new int[]{src,1});

        while(!pq.isEmpty()){
            int[] arr =pq.poll();
            int u=arr[0];
            int val=arr[1]+1;

            for(int v: graph[u]){
                if(dist[v]>val){
                    dist[v]=val;
                    pq.add(new int[]{v,val});
                }
            }

        }
        return dist[dest]==Integer.MAX_VALUE?0:dist[dest];
    }
}