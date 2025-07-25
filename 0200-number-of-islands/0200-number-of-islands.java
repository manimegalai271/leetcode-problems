class Solution {
    public int numIslands(char[][] grid) {
        int ans=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                if(grid[i][j]=='1')
                {   
                    ans++;
                    dfs(grid,i,j);
                }
            }
        }
        return ans;
    }
    public static void dfs(char[][] grid,int i,int j)
    {
        if(i<0 ||grid.length<=i || j<0 || grid[i].length<=j || grid[i][j]=='0')
        {
            return;
        }
        grid[i][j]='0';
        dfs(grid,i+1,j);//bottom
        dfs(grid,i,j+1);//right
        dfs(grid,i,j-1);//left
        dfs(grid,i-1,j);//top
    }
}