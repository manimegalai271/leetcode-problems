class Solution {
    public char findTheDifference(String s, String t) {
        StringBuilder st = new StringBuilder(t);
        for(int i = 0;i < s.length();i++)
        {
            char ch = s.charAt(i);
            for(int j = 0;j < st.length();j++)
            {
                if(st.charAt(j) == ch)
                {
                    st.deleteCharAt(j);
                    break;
                }
            }
        }
        return st.charAt(0);
    }
}
//Brute force apporach
//Time complexity = o(n ^ 2)
//space complexity = o(n)