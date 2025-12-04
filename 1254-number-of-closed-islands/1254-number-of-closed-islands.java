class Solution {
    public int closedIsland(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int islandcount = 0;
        for(int i = 1;i < r -1;i++)
        {
            for(int j = 1;j < c-1;j++)
            {
                if(grid[i][j] == 0)
                {
                    if(dfs(grid,i,j,r,c))
                    {
                        islandcount++;
                    }
                }
            }
        }
        return islandcount;
    }
    private boolean dfs(int[][] grid,int i,int j,int r,int c)
    {
        if(grid[i][j] == 1)
        {
            return true;
        }
        if(ifnot(i,j,r,c))
        {
            return false;
        }
        grid[i][j] = 1;

        boolean left = dfs(grid,i + 1,j,r,c);
        boolean right = dfs(grid, i - 1,j, r,c);
        boolean top = dfs(grid, i, j+1, r, c);
        boolean down = dfs(grid,i, j -1, r, c);

        return left && right && top && down;
    }
    private boolean ifnot(int i,int j,int r,int c)
    {
        if(i == 0 || j == 0 || i == r-1 || j == c-1)
        {
            return true;
        }
        return false;
    }
}