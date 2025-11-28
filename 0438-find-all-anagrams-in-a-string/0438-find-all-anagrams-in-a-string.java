class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        if(s.length() < p.length())return res;
        int[] freq = new int[26];
        int[] window = new int[26];
        for(int i = 0;i < p.length();i++)
        {
            freq[p.charAt(i) - 'a'] += 1;
            window[s.charAt(i) - 'a'] += 1;
        }
        if(Arrays.equals(freq,window))
        {
            res.add(0);
        }
        int ssize = s.length();
        int psize = p.length();
        for(int i = psize;i < ssize;i++)
        {
            window[s.charAt(i - psize) - 'a']--;
            window[s.charAt(i) - 'a']++;
            if(Arrays.equals(freq,window))
            {
                res.add(i - psize + 1);
            }
        }
        return res;
    }
}