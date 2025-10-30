class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n == 0 || n < 1)return false;
        if(n == 1)return true;
        if(1073741824 % n == 0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}