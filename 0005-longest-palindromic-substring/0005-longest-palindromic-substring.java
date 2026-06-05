class Solution {
    public String longestPalindrome(String s) {
        int maxlen = 1;
        int start = 0;
        for(int i = 1;i < s.length();i++)
        {
            int l = i - 1;
            int r = i;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r))
            {
                if(maxlen < (r - l + 1)){
                    maxlen = r - l + 1;
                    start = l;
                }
                l -= 1;
                r += 1;
            }
            l = i - 1;
            r = i + 1;
            while(l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r))
            {
                
                if(maxlen < (r - l + 1)){
                    maxlen = r - l + 1;
                    start = l;
                }
                l -= 1;
                r += 1;
            }
        }
        System.out.print(maxlen);
        System.out.print(start);
        return s.substring(start,start + maxlen );
    }
}