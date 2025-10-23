class Solution {
    public int compress(char[] chars) {
        if(chars.length == 1)
        {
            return 1;
        }
        int count = 1;
        String ans = "";
        for(int i = 1;i < chars.length;i++)
        {
            if(chars[i-1] == chars[i])
            {
                count++;
            }
            else 
            {
                ans = ans+ chars[i-1];
                if(count > 1)ans += count;
                count = 1;
            }
        }
        ans = ans + chars[chars.length-1];
        if(count > 1)ans += count;
        char[] ch = ans.toCharArray();
        for(int i = 0;i < ch.length;i++)
        {
            chars[i] = ch[i];
        }
        return ch.length;
    }
}