class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue=new LinkedList<>();
        int val=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==2){
                    queue.add(new int[]{i,j});
                }
                if(grid[i][j]==1){
                    val++;
                }
            }
        }
        int[][] dir = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        int count=0;

        while(!queue.isEmpty()){
            int size=queue.size();
            boolean changed=false;
            while(size>0){
                int[] dire=queue.poll();
                for(int[] di: dir){
                    int i=dire[0]+di[0]; 
                    int j=dire[1]+di[1]; 

                    if(i>=0 && j>=0 && i<grid.length && j<grid[0].length){
                        if(grid[i][j]==1){ 
                            queue.add(new int[]{i,j});
                            grid[i][j]=2;
                            val--;
                            changed=true;
                        }
                    }
                }
                size--; 
            }
            if(changed) count++;
            
        }
        return val==0?count:-1;
    }
}