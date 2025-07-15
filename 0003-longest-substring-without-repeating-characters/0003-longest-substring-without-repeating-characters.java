class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int maxlen=Math.min(s.length(),1);
        Set<Character> set=new HashSet<>();
        while(end<s.length())
        {
            char currentchar=s.charAt(end);
            while(set.contains(currentchar))
            {
                set.remove(s.charAt(start));
                start++;
            }
            set.add(currentchar);
            int windowsize=end-start+1;
            maxlen=Math.max(maxlen,windowsize);
            end++;
        }
        return maxlen;
    }
}