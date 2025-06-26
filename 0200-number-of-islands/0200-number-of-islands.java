class Solution {
    class Pair{
        int r;
        int c;
        public Pair(int r, int c){
            this.r=r;
            this.c=c;
        }
    }
    public void BFS(char[][] grid, boolean[][] vis,int i, int j, int rowL, int colL){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(i,j));
        vis[i][j]=true;
        int[] d_r = {1,0,0,-1};
        int[] d_c = {0,-1,1,0};

        while(!q.isEmpty()){
            Pair p = q.poll();
            int row = p.r;
            int col = p.c;

            for(int k=0;k<4;k++){
                int nRow = row + d_r[k];
                int nCol = col + d_c[k];

                if(nRow >= 0 && nRow < rowL && nCol >=0 && nCol < colL && grid[nRow][nCol]=='1' && vis[nRow][nCol]==false){
                    vis[nRow][nCol]=true;
                    q.add(new Pair(nRow, nCol));
                }
            }
            
        }
    }
    public int numIslands(char[][] grid) {
        boolean[][] vis = new boolean[grid.length][grid[0].length];

        int count=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(!vis[i][j] && grid[i][j]=='1'){
                    count++;
                    BFS(grid,vis,i,j,grid.length,grid[0].length);
                }
            }
        }
        return count;
    }
}