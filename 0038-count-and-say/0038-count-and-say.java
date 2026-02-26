class Solution {
    public String countAndSay(int n) {
        String s = "1";
        int count = 1;
        for(int i = 1;i < n;i++)
        {   
            String curr = "";
            int j = 1;
            
            for(j = 1;j < s.length();j++)
            {
                if(s.charAt(j) != s.charAt(j - 1))
                {
                    curr += "" + count + "" + s.charAt(j - 1);
                    count = 1;
                }
                else 
                {
                    count++;
                }
            }
            curr +=  "" + count + "" + s.charAt(j - 1);
            s = curr;
            count = 1; 
        }
        return s;
    }
}