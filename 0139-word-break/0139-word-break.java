class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        Set<String> word = new HashSet<>(wordDict);
        int maxlen = 0;
        for(String ss:wordDict)
        {
            if(ss.length() > maxlen)
            {
                maxlen = ss.length();
            }
        }
        boolean[] dp = new boolean[n+1];
        dp[0] = true;
        for(int i = 1;i <= n;i++)
        {
            for(int j = i -1; j >= Math.max(0,i - maxlen);j--)
            {
                if(dp[j] && word.contains(s.substring(j,i)))
                {
                    dp[i] = true;
                    break; 
                }
            }
        }
        return dp[n];
    }
}