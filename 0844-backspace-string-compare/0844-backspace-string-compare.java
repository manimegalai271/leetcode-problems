class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder ss = new StringBuilder();
        StringBuilder tt = new StringBuilder();
        for(int i = 0;i < s.length();i++)
        {
            if(s.charAt(i) == '#')
            {   
                if(ss.length() > 0)
                {
                   ss.deleteCharAt(ss.length() - 1); 
                }
            }
            else 
            {
                ss.append(s.charAt(i));
            }
        }
        for(int i = 0;i < t.length();i++)
        {
            if(t.charAt(i) == '#')
            {   
                if(tt.length() > 0)
                {
                   tt.deleteCharAt(tt.length()-1);
                }
            }
            else 
            {
                tt.append(t.charAt(i));
            }
        }
        return ss.toString().equals(tt.toString());
    }
}