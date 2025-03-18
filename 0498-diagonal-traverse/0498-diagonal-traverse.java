class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m * n];
        int i = 0;
        int j = 0;
        int p = 0;
        boolean up = true;
        while (p < ans.length) {
            ans[p++] = mat[i][j];   
            if (up) {
                if (j == n - 1) {
                    i++;
                    up = false;
                } else if (i == 0) { 
                    j++;
                    up = false;
                } else { 
                    i--;
                    j++;
                }
            } else {
                if (i == m - 1) { 
                    j++;
                    up = true;
                } else if (j == 0) {
                    i++;
                    up = true;
                } else { 
                    i++;
                    j--;
                }
            }
        }
        return ans;

    }
}