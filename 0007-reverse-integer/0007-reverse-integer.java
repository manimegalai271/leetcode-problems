class Solution {
    public int reverse(int x) {
        long n = x;
        long rev = 0;
        while(n != 0)
        {
             rev = rev * 10 + n % 10;
             n /= 10;
             if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE)
             {
                return 0;
             }
        }
        return (int)rev;
    }
}