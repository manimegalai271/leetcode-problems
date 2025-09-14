class Solution {
    int ans = 0;
    Set<String> visited = new HashSet<>();
    public int uniquePathsIII(int[][] grid) {
         int needed = 0;
         for(int i = 0;i < grid.length;i++)
         {
            for(int j = 0;j < grid[0].length;j++)
            {
                if(grid[i][j] != -1)
                {
                    needed++;
                }
            }
         }
        for(int i = 0;i < grid.length;i++)
        {
            for(int j = 0;j < grid[0].length;j++)
            {
                if(grid[i][j] == 1)
                {
                    dfs(i,j,grid,needed);
                }
            }
        }
        return ans;
    }
    public void dfs(int i,int j,int[][] grid,int needed)
    {
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
        {
            return;
        }
        if(visited.contains(i+":"+j))
        {
            return;
        }
        if(grid[i][j] == 2 && needed == 1)
        {
            ans++;
        }
        if(grid[i][j] == -1 || needed <= 0)
        {
            return;
        }
        visited.add(i+":"+j);
        dfs(i,j+1,grid,needed-1);
        dfs(i+1,j,grid,needed-1);
        dfs(i,j-1,grid,needed-1);
        dfs(i-1,j,grid,needed-1);
        visited.remove(i+":"+j);
        
    }
}