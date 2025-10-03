class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int ans = 0;
        for(int i = 0;i < n;i++)
        {
            char c = columnTitle.charAt(n - i - 1);
            int val = c - 'A' + 1;
            ans += val * Math.pow(26,i);
        }
        return ans;
    }
}