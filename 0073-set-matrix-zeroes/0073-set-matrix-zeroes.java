class Solution {
    public void setZeroes(int[][] matrix) {
        int mrow=matrix.length;
        int ncol=matrix[0].length;
        int[] row=new int[mrow];
        int[] col=new int[ncol];
        for(int i=0;i<mrow;i++)
        {
            for(int j=0;j<ncol;j++)
            {
                if(matrix[i][j]==0)
                {
                    row[i]=1;
                    col[j]=1;
                }
            }
        }
        for(int i=0;i<mrow;i++)
        {
            for(int j=0;j<ncol;j++)
            {
                if(row[i]==1 || col[j]==1)
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}