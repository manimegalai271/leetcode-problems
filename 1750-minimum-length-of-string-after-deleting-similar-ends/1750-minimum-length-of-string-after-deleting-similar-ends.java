class Solution {
    public int minimumLength(String s) {
        int len = s.length();
        if(s.charAt(0) != s.charAt(len - 1))
        {
            return len;
        }
        int left = 0;
        int right = len - 1;
        while(right < s.length() && left < right)
        {   
            if(s.charAt(left) != s.charAt(right))
            {
                break;
            }
            while(left < right && right < s.length() && s.charAt(left) == s.charAt(left + 1))
            {
                left++;
            }
            while(left < right && right < s.length() && s.charAt(right) == s.charAt(right - 1))
            {
                right--;
            }
            left++;
            right--;
        }
        if(left > right)
        {
            return 0;
        }
        return right - left + 1;
    }
}