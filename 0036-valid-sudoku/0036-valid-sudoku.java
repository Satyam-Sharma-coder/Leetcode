class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> st = new HashSet<>();
        
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') continue;
                
                String row = board[i][j] + "_row_" + i;
                String col = board[i][j] + "_col_" + j;
                String box = board[i][j] + "_box_" + (i / 3) + "_" + (j / 3);
                
                if (st.contains(row) || st.contains(col) || st.contains(box)) {
                    return false;
                }
                
                st.add(row);
                st.add(col);
                st.add(box);
            }
        }
        
        return true;
    }
}
