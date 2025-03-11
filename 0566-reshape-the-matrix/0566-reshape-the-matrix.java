class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        int p1=0;
        int p2=0;
        int[][] ans = new int[r][c];
        if (m * n != r * c) return mat;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(p2==mat[0].length){
                    p2=0;
                    p1++;
                }
                if(p1==mat.length) break; 
                ans[i][j]=mat[p1][p2++];
                
            }
        }
        return ans;
    }
}