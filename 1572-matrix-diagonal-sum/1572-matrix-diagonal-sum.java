class Solution {
    public int diagonalSum(int[][] mat) {
        int left_diagonal = 0;
        int s = 0;
        int e = mat.length - 1;
        int right_diagonal = 0;

        for(int i = 0; i < mat.length; i++)
        {
            for(int j = 0; j < mat[0].length; j++)
            {
                if(i == j)
                {
                    left_diagonal += mat[i][j];
                }

                if(s != e && i == s && j == e) 
                {
                    right_diagonal += mat[s][e];
                     s++;
                     e--;
                   
                }
                if(s == e)
                {
                    s++;
                    e--;
                }
               
            }
        }
        return left_diagonal + right_diagonal;
    }
}