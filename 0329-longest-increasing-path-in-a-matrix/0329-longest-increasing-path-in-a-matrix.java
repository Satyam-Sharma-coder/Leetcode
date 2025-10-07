class Solution {
    public int longestIncreasingPath(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[2]-a[2]);

        int[][] ans = new int[m][n];

        for(int i=0;i<m;i++){
            Arrays.fill(ans[i],Integer.MIN_VALUE);
        }

        pq.add(new int[]{0,0,1});
        int maxa=1;

        int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};

        while(!pq.isEmpty()){
            int[] data = pq.poll();
            int i=data[0];
            int j=data[1];
            int val=data[2];

            for(int[] d:dir){
                int ci=i+d[0];
                int cj=j+d[1];

                if(ci>=0 && cj>=0 && ci<m && cj<n){
                    if(matrix[i][j]>matrix[ci][cj]){
                        int put = ans[i][j]+1;
                        if(put>ans[ci][cj]){
                            ans[ci][cj]=put;
                            pq.add(new int[]{ci,cj,put});
                        }
                    }
                    else if(ans[ci][cj]==Integer.MIN_VALUE){
                        ans[ci][cj]=1;
                        pq.add(new int[]{ci,cj,1});
                    }
                    maxa=Math.max(maxa,ans[ci][cj]);
                }
            }
        }
        return maxa;

    }
}