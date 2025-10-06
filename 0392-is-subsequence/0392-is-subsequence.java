class Solution {
    public boolean isSubsequence(String s, String t) {
        int[][] arr=new int[t.length()+1][s.length()+1];
        for(int i=1;i<arr.length;i++)
        {
            for(int j=1;j<arr[i].length;j++)
            {
                if(t.charAt(i-1)==s.charAt(j-1))
                {
                    arr[i][j]=1+arr[i-1][j-1];
                }
                else 
                {
                    arr[i][j]=Math.max(arr[i][j-1],arr[i-1][j]);
                }
            }
        }
        return arr[arr.length-1][arr[0].length-1] == s.length();
    }
}