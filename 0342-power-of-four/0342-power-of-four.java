class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 0)return false;
        if(n == 1)return true;
        if(1073741824 % n == 0 && (n % 10 == 4 || n % 10 == 6))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}