class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
    int rows = rowSum.length;
    int cols = colSum.length;
    int[][] arr = new int[rows][cols];
    
    // Process each cell
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            // Fill the cell with the minimum of the remaining rowSum and colSum
            int value = Math.min(rowSum[i], colSum[j]);
            arr[i][j] = value;
            
            // Update the remaining rowSum and colSum
            rowSum[i] -= value;
            colSum[j] -= value;
        }
    }
    
    return arr;
    }
}