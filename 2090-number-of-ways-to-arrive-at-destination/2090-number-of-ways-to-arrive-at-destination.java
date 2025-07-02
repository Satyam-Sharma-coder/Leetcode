import java.util.*;

class Solution {
    public ArrayList<ArrayList<ArrayList<Integer>>> constructAdj(int[][] edges, int V) {
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], w = edge[2];
            adj.get(u).add(new ArrayList<>(Arrays.asList(v, w)));
            adj.get(v).add(new ArrayList<>(Arrays.asList(u, w))); // undirected
        }
        return adj;
    }

    public int countPaths(int V, int[][] edges) {
        int src = 0;
        int MOD = 1_000_000_007;
        ArrayList<ArrayList<ArrayList<Integer>>> adj = constructAdj(edges, V);

        // Use long for distance
        long[] dist = new long[V];
        int[] ways = new int[V];
        Arrays.fill(dist, Long.MAX_VALUE);

        dist[src] = 0;
        ways[src] = 1;

        // PriorityQueue stores [distance, node]
        PriorityQueue<long[]> pq = new PriorityQueue<>(Comparator.comparingLong(a -> a[0]));
        pq.offer(new long[]{0L, src});

        while (!pq.isEmpty()) {
            long[] curr = pq.poll();
            long d = curr[0];
            int u = (int) curr[1];

            if (d > dist[u]) continue;

            for (ArrayList<Integer> neighbor : adj.get(u)) {
                int v = neighbor.get(0);
                int weight = neighbor.get(1);

                if (dist[v] > d + weight) {
                    dist[v] = d + weight;
                    ways[v] = ways[u];
                    pq.offer(new long[]{dist[v], v});
                } else if (dist[v] == d + weight) {
                    ways[v] = (ways[v] + ways[u]) % MOD;
                }
            }
        }
        return ways[V-1];
    }
}