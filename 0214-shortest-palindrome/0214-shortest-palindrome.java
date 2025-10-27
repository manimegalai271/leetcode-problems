class Solution {
    public String shortestPalindrome(String s) {
        int n = s.length();
        String rev = new StringBuilder(s).reverse().toString();
        String org = s;
        String ss = org + "*" + rev;
        int i = 0;
        int j = 1;
        int[] lps = new int[n * 2 + 1];
        while(j < ss.length())
        {
            if(ss.charAt(i) == ss.charAt(j))
            {   
                lps[j] = i + 1;
                i++;
                j++;
            }
            else 
            {
                if(i > 0)
                {
                    i = lps[i - 1];
                }
                else 
                {   
                    lps[j] = 0;
                    j++;
                }
            }
        }
        int diff = n - lps[n * 2];
        org = rev.substring(0,diff) + org;
        return org;
    }
}