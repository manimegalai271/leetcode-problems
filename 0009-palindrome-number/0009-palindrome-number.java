class Solution {
    public boolean isPalindrome(int x) {
     int org=x;
     int rev=0;
     if(org>=0 && org<=9)
     {
        return true;
     }
     if(org>0)
     {
     while(x!=0)
     {
        rev=rev*10+x%10;
        x/=10;
     }
     return org==rev;
     }
     else 
     {
        return false;
     }

    }
}