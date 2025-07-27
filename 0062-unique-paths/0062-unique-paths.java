class Solution {
    int[][] dp;

    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        return dfs(0, 0, m, n); // start from top-left
    }

    public int dfs(int i, int j, int m, int n) {
        // Out of bounds
        if (i < 0 || j < 0 || i >= m || j >= n) {
            return 0;
        }

        // If already computed
        if (dp[i][j] > 0) {
            return dp[i][j];
        }

        // If reached bottom-right
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        // Move right and down
        int right = dfs(i, j + 1, m, n);
        int down = dfs(i + 1, j, m, n);

        // Store result and return
        dp[i][j] = right + down;
        return dp[i][j];
    }
}
