class Solution {
    public int diagonalSum(int[][] mat) {
        int sum1=0;
        int sum2=0;
        int n=mat.length;
        for(int i=0;i<mat.length;i++)
        {  
                sum1+=mat[i][i];
                sum2+=mat[i][n-1-i];
            
        }
        int sums=sum1+sum2;
        if(n%2==1)
        {
            return sums-=mat[n/2][n/2];
        }
        return sums;

    }
}