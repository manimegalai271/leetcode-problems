class Solution {
    public Boolean canreplace(int row,int col,List<String> curr)
    {
        for(int i = row-1;i>=0;i--)
        {
            if(curr.get(i).charAt(col) == 'Q')
            {
               return false;
            }
        }
        for(int i = row-1,j = col-1;i>=0 && j>=0;i--,j--)
        {
            if(curr.get(i).charAt(j) == 'Q')
            {
               return false;
            }
        }
        for(int i = row-1,j = col+1;i>=0 && j<curr.size();i--,j++)
        {
            if(curr.get(i).charAt(j) == 'Q')
            {
               return false;
            }
        }
        return true;
    }
    public void backtrack(int row,List<String> curr,List<List<String>> ans,int n)
    {
        if(row == curr.size())
        {
            ans.add(new ArrayList(curr));
            return;
        }
        for(int col = 0;col < curr.size();col++)
        {
            if(canreplace(row,col,curr))
            {
                StringBuilder sb = new StringBuilder(curr.get(row));
                sb.setCharAt(col,'Q');
                curr.set(row,sb.toString());
                backtrack(row+1,curr,ans,n);
                sb.setCharAt(col,'.');
                curr.set(row,sb.toString());

            }
        }
    }
    public int totalNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        List<String> curr = new ArrayList<>();
        for(int i = 0;i < n;i++)
        {
            curr.add(".".repeat(n));
        }
        backtrack(0,curr,ans,n);
        return ans.size();
    }
}