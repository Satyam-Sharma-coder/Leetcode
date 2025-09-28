class Solution {
    int ans;

    public void helper(int i, char[][] board, Set<String> set, int n) {
        if (n == 0) {
            ans++;
            return;
        }
        if (i == board.length) {
            return;
        }

        for (int j = 0; j < board.length; j++) {
            String row = "R" + i;
            String col = "C" + j;
            String left = "LS" + (i - j);
            String right = "RS" + (i + j);

            if (!set.contains(row) && !set.contains(col) && !set.contains(left) && !set.contains(right)) {
                board[i][j] = 'Q';
                set.add(row);
                set.add(col);
                set.add(left);
                set.add(right);

                helper(i + 1, board, set, n - 1);
                board[i][j] = '.';
                set.remove(row);
                set.remove(col);
                set.remove(left);
                set.remove(right);
            }
        }

    }

    public int totalNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }
        ans = 0;
        helper(0, board, new HashSet<>(), n);
        return ans;
    }
}