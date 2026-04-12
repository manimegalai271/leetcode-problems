class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int sr = 0;
        int sc = 0;
        int er = mat.length - 1;
        int ec = mat[0].length - 1;
        int count = (er+1) * (ec+1);
        List<Integer> ans = new ArrayList<>();
        while(sr <= er && sc <= ec)
        {
            for(int i = sr;i <= ec;i++)
            {
                ans.add(mat[sr][i]);
            }
            sr += 1;
            for(int i = sr;i <= er;i++)
            {
                ans.add(mat[i][ec]);
            }
            ec -= 1;
            for(int i = ec;i >= sc;i--)
            {   
                if(ans.size() == count)
                {
                    break;
                }
                ans.add(mat[er][i]);
            }
            er -= 1;
            for(int i = er;i >= sr;i--)
            {   
                if(ans.size() == count)
                {
                    break;
                }
                ans.add(mat[i][sc]);
            }
        }
        return ans;
        
    }
}