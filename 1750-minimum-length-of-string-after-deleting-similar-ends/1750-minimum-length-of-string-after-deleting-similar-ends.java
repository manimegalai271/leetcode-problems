class Solution {
    public int minimumLength(String s) {
        int len = s.length();
        if(s.charAt(0) != s.charAt(len - 1))
        {
            return len;
        }
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while(right < ch.length && left < right)
        {
            if(ch[left] != ch[right])
            {
                break;
            }
            int ls = left;
            while(left < right && left < ch.length  && ch[left] == ch[left + 1])
            {
                left++;
            }
            int rs = right;
            while(left < right && right < ch.length && ch[right] == ch[right - 1])
            {
                right--;
            }
            for(int i = ls;i <= left;i++)
            {
                ch[i] = '@';
            }
            for(int i = rs;i >= right;i--)
            {
                ch[i] = '@';
            }
            left++;
            right--;
        }
        int ans = 0;
        for(int i = 0;i < ch.length;i++)
        {
            if(ch[i] != '@')
            {
                ans++;
            }
        }
        return ans;
    }
}