class Solution {
    public int numEnclaves(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int i = 0;i < m;i++)
        {
            dfs(board,i,0);
            dfs(board,i,n -1);
        }
        for(int i = 0;i < n;i++)
        {
            dfs(board,0,i);
            dfs(board,m-1,i);
        }
        int count = 0;
        for(int i = 0; i < m;i++)
        {
            for(int j = 0;j < n;j++)
            {
                if(board[i][j] == 1)
                {
                    count++;
                }
            }
        }
        return count;
    }
    public void dfs(int[][] board,int row,int col) {
        if(row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != 1)
        {
            return;
        }
        board[row][col] = 5;

        dfs(board,row + 1,col);
        dfs(board,row - 1,col);
        dfs(board,row,col + 1);  
        dfs(board,row,col - 1);
    }
}