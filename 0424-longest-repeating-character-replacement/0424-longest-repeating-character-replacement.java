class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int low = 0;
        int high = 0;
        int windowsize = 0;
        int maxfreq = 0;
        int res = 0;
        while(high < s.length())
        {
            freq[s.charAt(high) - 'A'] += 1;
            maxfreq = Math.max(maxfreq,freq[s.charAt(high) - 'A']);
            windowsize = high - low + 1;
            int to_wanna_change = windowsize - maxfreq;
            if(to_wanna_change > k)
            {
                freq[s.charAt(low) - 'A'] -= 1;
                low++;
            }
            windowsize = high - low + 1;
            res = Math.max(maxfreq, windowsize);
            high++;
        }
        return res;
    }
}