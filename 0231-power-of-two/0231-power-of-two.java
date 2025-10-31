class Solution {
    public boolean isPowerOfTwo(int n) {
        int count = 0;
        int org = n;
        if(n == 0)return false;
        while(n % 2 == 0)
        {
            n /= 2;
            count++;
        }
        int ans = (int)Math.pow(2,count);
        if(ans == org)
        {
            return true;
        }
        return false;
    }
}