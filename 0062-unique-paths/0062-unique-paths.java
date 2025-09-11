class Solution {
    int[][] dps;
    public int dp(int i,int j,int m,int n)
    {
        if(i<0 || j<0 || i>=m || j>=n)
        {
            return 0;
        }
        if(dps[i][j]>0)
        {
            return dps[i][j];
        }
        if(i == m-1 && j == n-1)
        {
            return 1;
        }
        int right = dp(i,j+1,m,n);
        int down = dp(i+1,j,m,n);
        dps[i][j] = right+down;
        return dps[i][j];
    }
    public int uniquePaths(int m, int n) {
        dps = new int[m][n];
        return dp(0,0,m,n);
    }
}