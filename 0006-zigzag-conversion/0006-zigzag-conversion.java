class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length() <= numRows)
        {
            return s;
        }
        StringBuilder[] ss = new StringBuilder[numRows];
        for(int i = 0;i < numRows;i++)
        {
            ss[i] = new StringBuilder();
        }
        int curr = 0;
        Boolean movedown = false;
        for(char c:s.toCharArray())
        {
            ss[curr].append(c);
            if(curr == 0 || curr == numRows-1)
            {
                movedown = !movedown;
            }
            curr += movedown ?1:-1;
        }
        StringBuilder ans = new StringBuilder();
        for(StringBuilder temp:ss)
        {
            ans.append(temp);
        }
        return ans.toString();
    }
}
//Time complexity - o(n)