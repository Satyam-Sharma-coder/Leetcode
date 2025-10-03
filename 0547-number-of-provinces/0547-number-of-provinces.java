class Solution {
    public void dfs(int i, int[][] isConnected, boolean[] isVisited){
        isVisited[i]=true;

        for(int j=0;j<isConnected[i].length;j++){
            if(isConnected[i][j]==1){
                isConnected[i][j]=0;
                dfs(j,isConnected, isVisited);
            }
        }


    }
    public int findCircleNum(int[][] isConnected) {
        int count=0;
        boolean[] isVisited= new boolean[isConnected.length];
        for(int i=0;i<isVisited.length;i++){
            if(isVisited[i]==false){
                dfs(i,isConnected,isVisited);
                count++;
            }
        }
        return count;
    }
}