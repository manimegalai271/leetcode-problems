class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int l=0;
        int d=0;
        int u=0;
        String org=password;
        for(int i=0;i<org.length()-1;i++)
        {
            if(org.charAt(i)==org.charAt(i+1))
            {
                return false;
            }
        }
        for(int i=0;i<password.length();i++)
        {
            if(Character.isLowerCase(password.charAt(i)))
            {
               l++;
            }
            else if(Character.isUpperCase(password.charAt(i)))
            {
                u++;
            }
            else if(Character.isDigit(password.charAt(i)))
            {
                d++;
            }
        }
        if(password.matches(".*[^a-zA-Z0-9].*") && password.length()>=8 && l>=1 && u>=1 && d>=1)
        {
            return true;
        }
        else 
        {
            return false;
        }
        
    }
}