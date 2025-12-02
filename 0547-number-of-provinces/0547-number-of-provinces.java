class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int provinces = 0;
        for(int i = 0;i < n;i++)
        {
             if(!visited[i])
             {
                dfs(isConnected,visited,i,n);
                provinces++;
             }
        }
        return provinces;
    }
    public void dfs(int[][] isConnected,boolean[] visited,int i,int n)
    {
        visited[i] = true;
        for(int j = 0;j < n;j++)
        {
            if(isConnected[i][j] == 1 && !visited[j])
            {
                dfs(isConnected,visited,j,n);
            }
        }
    }
}