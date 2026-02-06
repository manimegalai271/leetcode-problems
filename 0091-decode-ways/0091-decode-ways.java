class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if(n == 0)return 0;
        if(s.charAt(0) == '0')return 0;
        int[] dp = new int[n + 1];
        if(s.charAt(0) != '0')dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ?0:1;
        for(int i = 2;i <= n;i++)
        {
            int onedigit = s.charAt(i - 1) - '0';
            if(onedigit >= 1)
            {
                dp[i] += dp[i - 1];
            }
            int ones = s.charAt(i - 1) - '0';
            int twos  = s.charAt(i - 2) - '0';
            int twodigit = twos * 10 + ones;
            if(twodigit >= 10 && twodigit <= 26)
            {
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }
}
//Time complexity = o(n)
//space complexity = o(n)