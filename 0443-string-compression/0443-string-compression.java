class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1)
        {
            return 1;
        }
        int count = 1;
        String s = new String(chars);
        String ans = "";
        for(int i = 1;i < s.length();i++)
        {
            if(s.charAt(i-1) == s.charAt(i))
            {
                count++;
            }
            else 
            {
                ans = ans+s.charAt(i-1);
                if(count > 1)ans += count;
                count = 1;
            }
        }
        ans = ans + s.charAt(s.length()-1);
        if(count > 1)ans += count;
        chars = ans.toCharArray();
        return chars.length;
    }
}