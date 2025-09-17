class Solution {
    public int getMaximumGold(int[][] arr) {
        int maxGold = 0;
       for(int i = 0;i < arr.length;i++)
       {
           for(int j = 0;j <arr[0].length;j++)
           {   
               if(arr[i][j] >0)
               {   
                   maxGold = Math.max(maxGold, backtrack(arr, i, j,maxGold));
               }
           }
       }
       return maxGold;
    }
    public  int backtrack(int[][] arr,int i,int j,int maxGold)
    {
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j] == 0)
        {
            return 0;
        }
        int curr = arr[i][j];
        arr[i][j] = 0;
        
        int left = backtrack(arr,i,j-1,maxGold);
        int right = backtrack(arr,i,j+1,maxGold);
        int top = backtrack(arr,i-1,j,maxGold);
        int down = backtrack(arr,i+1,j,maxGold);
        
        arr[i][j] = curr;
        
        return curr + Math.max(Math.max(left, right), Math.max(top, down));
    }
}