class Solution {
    char[][] board2 = new char[9][9];
    boolean solved = false; 
    public void helper(int ip,int jp, char[][] board, Set<String> set) {

        if(solved) return;
        if (ip==9) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    board2[i][j] = board[i][j];
                }
            }
            solved=true;
            return;
        }
        if(jp==9){
            helper(ip+1, 0, board, set);
            return;
        }
        if (board[ip][jp] != '.') { 
            helper(ip, jp + 1, board, set);
            return;
        }
        for(char ch='1';ch<='9';ch++){
            String rowv = ch + "R" + ip;
            String colv = ch + "c" + jp;
            String gridv = ch + "G" + (ip / 3) + (jp / 3);
            if(board[ip][jp]=='.' && !set.contains(rowv) && !set.contains(colv) && !set.contains(gridv)){
                board[ip][jp]=ch;
                set.add(rowv);
                set.add(colv);
                set.add(gridv);
                helper(ip,jp+1,board,set);
                board[ip][jp]='.';
                set.remove(rowv);
                set.remove(colv);
                set.remove(gridv);
            }
        }
    }

    public void solveSudoku(char[][] board) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                String rowv = board[i][j] + "R" + i;
                String colv = board[i][j] + "c" + j;
                String gridv = board[i][j] + "G" + (i / 3) + (j / 3);
                if (board[i][j] != '.') {
                    set.add(rowv);
                    set.add(colv);
                    set.add(gridv);
                }
            }
        }

        helper(0, 0, board, set);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = board2[i][j];
            }
        }
    }
}