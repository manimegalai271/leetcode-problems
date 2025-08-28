class Solution {
    public boolean isHappy(int n) {
       if(n==1 || n==7)
       {
        return true;
       }
       if(n>1 && n<10)
       {
        return false;
       }
       return n%9!=0;
    }
}