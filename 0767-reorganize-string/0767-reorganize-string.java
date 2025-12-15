class Solution {
    public String reorganizeString(String s) {
        int[] count = new int[26];
        for(int i = 0;i < s.length();i++)
        {
            char ch = s.charAt(i);
            count[ch - 'a']++;
        }
        int max = 0;
        int index = 0;
        for(int i = 0;i < 26;i++)
        {
            if(max < count[i])
            {
                max = count[i];
                index = i;
            }
        }
        if(max > (s.length() + 1)/2)
        {
            return "";
        }
        char[] res = new char[s.length()];
        int idx = 0;
        while(count[index]-- > 0)
        {
            res[idx] = (char)(index + 'a');
            idx += 2;
        }
        for(int i = 0;i < 26;i++)
        {
            
            while(count[i]-- > 0)
            { 
              if(idx >= res.length)idx = 1;

              res[idx] = (char) (i + 'a');
              idx += 2;
            }
        }
        return String.valueOf(res);
    }
}