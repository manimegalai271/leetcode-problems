class Solution {
    public boolean isPowerOfFour(int n) {
        int count = 0;
        int org = n;
        if(n == 0)return false;
        while(n % 4 == 0)
        {
            n /= 4;
            count++;
        }
        int ans = (int)Math.pow(4,count);
        if(ans == org)
        {
            return true;
        }
        return false;
    }
}