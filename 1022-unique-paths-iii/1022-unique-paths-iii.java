class Solution {
    int count=0;
    int[][] path = {{0,-1},{0,1},{-1,0},{1,0}};
    public void helper(int i,int j,int[][] grid){
        if(i<0 || j<0 || i>grid.length-1 || j>grid[0].length-1){
            return;
        }
        if(grid[i][j]==-1){
            return;
        }
        if(grid[i][j]==2){
            for(int ip=0;ip<grid.length;ip++){
                for(int jp=0;jp<grid[0].length;jp++){
                    if(grid[ip][jp]==0){
                        return;
                    }
                }
            }
            count++;
            return;
        }

        for(int[] p: path){
            grid[i][j]=-1;
            helper(i+p[0],j+p[1],grid);
            grid[i][j]=0;
        }
    }
    public int uniquePathsIII(int[][] grid) {
        int starti=0;
        int startj=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    starti=i;
                    startj=j;
                    break;
                }
            }
        }



        helper(starti,startj,grid);
        return count;
    }
}