class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i=0;i<accounts.length;i++){
            int sum = accounts[i][0];
            for(int j=1;j<accounts[0].length;j++){
                sum += accounts[i][j];
            }
            max = Math.max(max,sum);
        }
        return max;
    }
}