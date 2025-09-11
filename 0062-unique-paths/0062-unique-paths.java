class Solution {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        int i = 0;
        for(int j = 0;j < n;j++)
        {
            arr[i][j] = 1;
        }
        int q = 0;
        for(int p=0;p < m;p++)
        {
            arr[p][q] = 1;
        }
        for(int r = 1;r < m;r++)
        {
            for(int s = 1;s < n;s++)
            {
                if(arr[r][s] == 0)
                {
                    arr[r][s] = arr[r][s-1]+arr[r-1][s];
                }
            }
        }
        return arr[m-1][n-1];
    }
}