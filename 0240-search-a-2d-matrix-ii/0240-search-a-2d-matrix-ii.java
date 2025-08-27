class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int rowidx = 0;
       int colidx = matrix[0].length-1;
       while(colidx >= 0 && rowidx < matrix.length)
       {
        if(matrix[rowidx][colidx] == target)
        {
            return true;
        }
        else if(matrix[rowidx][colidx] < target)
        {
            rowidx++;
        }
        else 
        {
            colidx--;
        }
       }
       return false;
    }
}