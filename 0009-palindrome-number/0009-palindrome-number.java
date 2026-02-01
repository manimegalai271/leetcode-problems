class Solution {
    public boolean isPalindrome(int n) {
        StringBuilder sb = new StringBuilder(String.valueOf(n));
         int left = 0;
         int right = sb.length() - 1;
         while(left < right)
         {
             if(sb.charAt(left) == sb.charAt(right))
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