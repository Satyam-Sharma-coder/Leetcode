class Solution {
    public int DFS(int i,int j,int[][] grid){
        grid[i][j]=0;
        int count=1;

        if(i-1>=0 && grid[i-1][j]==1) count += DFS(i-1,j,grid);
        if(i+1<grid.length && grid[i+1][j]==1) count += DFS(i+1,j,grid);
        if(j-1>=0 && grid[i][j-1]==1) count += DFS(i,j-1,grid);
        if(j+1<grid[0].length && grid[i][j+1]==1) count += DFS(i,j+1,grid);
        return count;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    int val= DFS(i,j,grid);
                    count=Math.max(val,count);

                }
            }
        }
        return count;
    }
}