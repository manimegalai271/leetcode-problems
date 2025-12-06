class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[][] ans = new int[row][col];
        boolean[][] visited = new boolean[row][col];
        Queue<int[]> q = new LinkedList<>();
        for(int i = 0;i < row;i++)
        {
            for(int j = 0;j < col;j++)
            {
                if(mat[i][j] == 0)
                {
                    q.offer(new int[]{i,j});
                    visited[i][j] = true;
                }
            }
        }
        int[][] dir = {{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty())
        {
            int[] a = q.poll();
            int i = a[0];
            int j = a[1];
            
            for(int[] d:dir)
            {
                int ni = i + d[0];
                int nj = j + d[1];

                if(ni >= 0 && ni < row && nj >= 0 && nj < col && !visited[ni][nj])
                {
                    ans[ni][nj] = ans[i][j] + 1;
                    visited[ni][nj] = true;
                    q.add(new int[]{ni,nj});
                }
            }
            
            
        }
        return ans;
    }
    
}
//time complexity  =o(m * n)
//space complexity = o(m *n )