class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int ans = 0;
        for(int i = 0;i < n;i++)
        {
            char c = columnTitle.charAt(i);
            int val = c - 'A' + 1;
            ans = ans * 26 + val;
        }
        return ans;
    }
}