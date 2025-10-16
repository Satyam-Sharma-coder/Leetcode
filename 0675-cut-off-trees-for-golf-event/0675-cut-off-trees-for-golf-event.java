class Solution {
    public int cutOffTree(List<List<Integer>> forest) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2] - b[2]);

        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < forest.size(); i++) {
            for (int j = 0; j < forest.get(i).size(); j++) {
                if (forest.get(i).get(j) > 1) {
                    pq.add(new int[] { i, j, forest.get(i).get(j) });
                }
            }
        }

        int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };
        int maxa = 0;
        int s_i=0,s_j=0;
        while (!pq.isEmpty()) {
            queue.clear();
            boolean[][] ans = new boolean[forest.size()][forest.get(0).size()];
            int[] val = pq.poll();
            int i = val[0];
            int j = val[1];
            queue.add(new int[] { s_i, s_j });
            ans[s_i][s_j] = true;
            boolean flag = false;
            int count = 0;
            while (!queue.isEmpty()) {
                int size= queue.size();
                while (size-- > 0) {
                    int[] d = queue.poll();
                    if (d[0] == i && d[1] == j) {
                        flag = true;
                        break;
                    }
                    for (int[] di : dir) {
                        int new_i = d[0] + di[0];
                        int new_j = d[1] + di[1];
                        if (new_i >= 0 && new_j >= 0 && new_i < ans.length && new_j < ans[0].length
                                && forest.get(new_i).get(new_j) != 0 && ans[new_i][new_j] == false) {
                            ans[new_i][new_j] = true;
                            queue.add(new int[] { new_i, new_j });
                        }
                    }
                }
                if(flag) break;
                count++;
            }
            if (flag == false) {
                return -1;
            }
            maxa +=count;
            s_i=i;
            s_j=j;
           
        }
        return maxa;

    }
}