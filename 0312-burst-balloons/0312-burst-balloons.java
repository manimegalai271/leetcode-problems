class Solution {
    public int maxCoins(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n + 2];
        arr[0] = 1;
        for (int i = 0; i < n; i++) arr[i + 1] = nums[i];
        arr[n + 1] = 1;
        int N = n + 2;
        int[][] dp = new int[N][N]; // dp[i][j] = max coins for interval (i, j)

        // length is distance between i and j
        for (int len = 2; len < N; len++) { // len = j - i
            for (int i = 0; i + len < N; i++) {
                int j = i + len;
                int best = 0;
                for (int k = i + 1; k < j; k++) {
                    int coins = dp[i][k] + arr[i] * arr[k] * arr[j] + dp[k][j];
                    if (coins > best) best = coins;
                }
                dp[i][j] = best;
            }
        }
        return dp[0][N - 1];

    }
}