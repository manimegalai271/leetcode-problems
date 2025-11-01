class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0;i <= n;i++)
        {
           int ones = 0;
           int org = i;
           for(int j = 1;j <= 32;j++)
           {
            ones += org&1;
            org = org >> 1;
           }
           ans[i] = ones;
        }
        return ans;
    }
}