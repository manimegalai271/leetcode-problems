class Solution {
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int count = 0;
        for(int i = 0;i < grid2.length;i++)
        {
            for(int j = 0;j < grid2[0].length;j++)
            {   
                if(grid2[i][j] == 1)
                {
                    if(dfs(grid1,grid2,i,j))
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public boolean dfs(int[][] grid1, int[][] grid2,int i,int j)
    {
        if(i < 0 || j < 0 || i >= grid2.length || j >= grid2[0].length || grid2[i][j] == 0)
        {
            return true;
        }
        grid2[i][j] = 0;
        boolean valid = grid1[i][j] == 1;

        boolean down = dfs(grid1,grid2,i+1,j);
        boolean up = dfs(grid1,grid2,i-1,j);
        boolean left= dfs(grid1,grid2,i,j+1);
        boolean right = dfs(grid1,grid2,i,j-1);

        return valid && down && up && left && right;
    }
}