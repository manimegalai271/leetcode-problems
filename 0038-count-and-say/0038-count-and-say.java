class Solution {
    public String countAndSay(int n) {        
        String s="1";
        for(int i=1;i<n;i++)
        {
            int j=0;
            String next="";
            while(j<s.length())
            {
                int count=1;
                while(j<s.length()-1 && s.charAt(j)==s.charAt(j+1))
                {   

                    count++;
                    j++;
                }
                next += Integer.toString(count) + s.charAt(j);

                j++;
            }
            s=next;
        }
        return s;
        
    }
}
