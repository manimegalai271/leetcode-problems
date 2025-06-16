class Solution {
    public int strStr(String haystack, String needle) {
        int index=-1;
        for(int i=0;i<=haystack.length()-needle.length();i++)
        {   
            int org=i;
            int flag=1;
            if(haystack.charAt(i)==needle.charAt(0))
            {
                for(int j=0;j<needle.length();j++)
                {
                    if(needle.charAt(j)==haystack.charAt(org))
                    {
                        org++;
                        flag=1;
                    }
                    else 
                    {
                        flag=0;
                        break;
                    }
                }
                if(flag==1)
                {
                    return i;
                }
            }
            
        }
        return -1;
    }
}