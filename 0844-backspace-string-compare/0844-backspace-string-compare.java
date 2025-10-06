class Solution {
    public boolean backspaceCompare(String s, String t) {
        String ans1 = "";
        String ans2 = "";
        for(int i = 0;i < s.length();i++)
        {
            if(s.charAt(i) == '#')
            {   
                if(ans1.length() > 0)
                {
                   ans1 = ans1.substring(0,ans1.length()-1);
                }
            }
            else 
            {
                ans1 = ans1 + s.charAt(i); 
            }
        }
        for(int i = 0;i < t.length();i++)
        {
            if(t.charAt(i) == '#')
            {   
                if(ans2.length() > 0)
                {
                   ans2 = ans2.substring(0,ans2.length()-1);
                }
            }
            else 
            {
                ans2 = ans2 + t.charAt(i); 
            }
        }
        return ans1.equals(ans2);
    }
}