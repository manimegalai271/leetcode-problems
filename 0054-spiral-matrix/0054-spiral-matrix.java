class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowstart = 0;
        int rowend = matrix.length;
        int colstart = 0;
        int colend = matrix[0].length;
        List<Integer> list=new ArrayList<>();
        while(rowstart < rowend && colstart < colend)
        {
            for(int i=colstart;i<colend;i++)
            {
                list.add(matrix[rowstart][i]);
            }
            rowstart+=1;
            for(int i=rowstart;i<rowend;i++)
            {
                list.add(matrix[i][colend-1]);
            }
            colend--;
            if(rowstart < rowend)
            {
            for(int i=colend-1;i>=colstart;i--)
            {
                list.add(matrix[rowend-1][i]);
            }
            rowend--;
            }
            if(colstart < colend)
            {
            for(int i=rowend-1;i>=rowstart;i--)
            {
                list.add(matrix[i][colstart]);
            }
            colstart++;
            }
        }
        return list;
    }
}