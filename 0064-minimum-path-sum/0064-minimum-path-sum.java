public class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        
        for (int i = grid.length - 1; i >= 0; i--) {
            for (int j = grid[0].length - 1; j >= 0; j--) {
                
                if (i == grid.length - 1 && j != grid[0].length - 1) {
                    // Last row, not last column
                    dp[i][j] = grid[i][j] + dp[i][j + 1];
                } 
                else if (j == grid[0].length - 1 && i != grid.length - 1) {
                    // Last column, not last row
                    dp[i][j] = grid[i][j] + dp[i + 1][j];
                } 
                else if (j != grid[0].length - 1 && i != grid.length - 1) {
                    // Middle cells
                    dp[i][j] = grid[i][j] + Math.min(dp[i + 1][j], dp[i][j + 1]);
                } 
                else {
                    // Bottom-right corner
                    dp[i][j] = grid[i][j];
                }
            }
        }
        
        return dp[0][0];
    }
}
