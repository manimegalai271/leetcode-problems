class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]==1)
                {   
                    
                    ans = Math.max(dfs(grid,i,j),ans);
                }
            }
        }
        return ans;
    }
    public static int dfs(int[][] grid,int i,int j)
    {   
        if(i<0 ||grid.length<=i || j<0 || grid[i].length<=j || grid[i][j] == 0)
        {
            return 0;
        }
        grid[i][j]=0;

        return 1
        +dfs(grid,i+1,j)
        +dfs(grid,i,j+1)
        +dfs(grid,i,j-1)
        +dfs(grid,i-1,j);//top
    }
}
//time complexity = o(m * n)
//space complexity = o(m n)