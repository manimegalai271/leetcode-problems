class Solution {
    public int orangesRotting(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][] time = new int[row][col];
        for(int i = 0;i < row;i++)
        {
            for(int j = 0;j < col;j++)
            {
                time[i][j] = Integer.MAX_VALUE;
            }
        }
        for(int i = 0;i < row;i++)
        {
            for(int j = 0;j < col;j++)
            {
                if(grid[i][j] == 2)
                {
                    dfs(grid,time,i,j,0);
                }
            }
        }
        int minute = 0;
        for(int i = 0;i < row;i++)
        {
            for(int j = 0;j < col;j++)
            {
                if(grid[i][j] == 1)
                {
                    if(time[i][j] == Integer.MAX_VALUE)return -1;
                    minute = Math.max(minute,time[i][j]);
                }
            }
        }
        return minute;

    }
    private static void dfs(int[][] grid,int[][] time,int i,int j,int count)
    {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || count >= time[i][j])
        {
            return;
        }
        time[i][j] = count;
        dfs(grid,time,i + 1,j,count + 1);
        dfs(grid,time,i - 1,j,count + 1);
        dfs(grid,time,i,j + 1,count + 1);
        dfs(grid,time,i,j - 1,count + 1);
    }
}