class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while(left < right)
        {
            if(s.charAt(left) == s.charAt(right))
            {
                left++;
                right--;
            }
            else 
            {
                return palindrome(s,left + 1,right) || palindrome(s,left,right - 1);
            }
        }
        return true;
    }
    public boolean palindrome(String s,int l,int r)
    {
        int left = l;
        int right = r;
        while(left < right)
        {
            if(s.charAt(left) == s.charAt(right))
            {
                left++;
                right--;
            }
            else 
            {
                return false;
            }
        }
        return true;
    }
}