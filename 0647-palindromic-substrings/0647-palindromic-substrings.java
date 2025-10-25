class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = n * (n+1) / 2;
        String[] arr = new String[count];
        int i = 0;
        for(int k = 0;k < s.length();k++)
        {   
            String temp = "";
            for(int j = k;j < s.length();j++)
            {
                temp = temp + s.charAt(j);
                arr[i++] = temp;
            }
            temp = "";
        }
        int ans = 0;
        for(String ss:arr)
        {
            if(palindrome(ss))
            {
                ans++;
            }
        }
        return ans;
    }
    public  Boolean palindrome(String ss)
    {
        int i = 0;
        int j = ss.length()- 1;
        while(i < j)
        {
            if(ss.charAt(i) != ss.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}