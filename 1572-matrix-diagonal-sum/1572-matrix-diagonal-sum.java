class Solution {
    public int diagonalSum(int[][] mat) {
        int left_sum = 0;
        int right_sum = 0;
        int n = mat.length;
        for(int i = 0;i < mat.length;i++)
        {
            left_sum += mat[i][i];
            right_sum += mat[i][n - i - 1];
        }
        int total_sum = left_sum + right_sum;
        if(n % 2 == 1)
        {
            total_sum -= mat[n / 2][n / 2];
        }
        return total_sum;
    }
}