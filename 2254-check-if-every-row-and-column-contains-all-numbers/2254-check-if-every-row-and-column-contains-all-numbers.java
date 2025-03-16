class Solution {
    public boolean checkValid(int[][] matrix) {
    for (int i = 0; i < matrix.length; ++i) {
      Set<Integer> set1 = new HashSet<>();
      Set<Integer> set2 = new HashSet<>();
      for (int j = 0; j < matrix.length; ++j) {
        set1.add(matrix[i][j]);
        set2.add(matrix[j][i]);
      }
      if (Math.min(set1.size(), set2.size()) < matrix.length)
        return false;
    }
    return true;
    }
}