class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> a[2]-b[2]);
        pq.add(new int[]{0,0,0});


        int[][] dir = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};

        int[][] ans = new int[m][n];

        for(int i=0;i<m;i++){
            Arrays.fill(ans[i],Integer.MAX_VALUE);
        }
        ans[0][0]=0;

        while(!pq.isEmpty()){


            int[] curr = pq.poll();
            int ci= curr[0];
            int cj=curr[1];
            if(ci==m-1 && cj==n-1){
                return ans[ci][cj];
            }

            for(int[] di: dir){
                int i= ci+di[0];
                int j=cj+di[1];

                if(i>=0 && j>=0 && i<m && j<n){
                    
                    int diff=Math.abs(heights[i][j]-heights[ci][cj]);
                    int val=Math.max(diff,ans[ci][cj]);

                    if(val<ans[i][j]){
                        ans[i][j]=val;
                        pq.add(new int[]{i,j,val});
                    }
                }
            }
        }
        return -1;

    }
}