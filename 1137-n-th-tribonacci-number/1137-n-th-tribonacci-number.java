class Solution {
    public int tribonacci(int n) {
        int ans = trib(n);
        return ans;
    }
    public int trib(int n)
    {
        if(n < 2)
        {
            return n;
        }
        else if(n == 2)
        {
            return 1;
        }
        return trib(n-1) + trib(n-2)+ trib(n-3);
    }
}