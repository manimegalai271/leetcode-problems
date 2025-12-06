class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        if(grid.length == 0)
        {
            return -1;
        }
        if(grid.length == 1 && grid[0][0] == 0)return 1;
        if(grid[0][0] == 1)
        {
            return -1;
        }
        if(grid[row-1][col-1] == 1)
        {
            return -1;
        }
        Queue<int[]> q = new LinkedList<>();
        int[][] dir = {{-1,0},{0,-1},{0,1},{1,0},{1,-1},{-1,1},{-1,-1},{1,1}};
        q.offer(new int[]{0,0});
        grid[0][0] = 1;
        int count = 1;
        while(!q.isEmpty())
        {  
            int size = q.size();
            count++;
            for(int s = 0;s < size;s++)
            {
                int[] a = q.poll();
                int i = a[0];
                int j = a[1];
                for(int[] d:dir)
                {
                    int nr =  i + d[0];
                    int nc = j + d[1];
                    if(nr < 0 || nr >= row || nc < 0 || nc >= col)continue;
                    if(grid[nr][nc] == 1)continue;
                    if(nr == row - 1 && nc == col - 1)return count;
                    grid[nr][nc] = 1;
                    q.add(new int[]{nr,nc});
                }
            }
        }
        return -1;

    }
}