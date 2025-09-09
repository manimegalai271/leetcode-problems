class Solution {
    int[] ans = new int[38];
    public int tribonacci(int n) {
         if(n < 2)
        {
            return n;
        }
        else if(n == 2)
        {
            return 1;
        }
        if(ans[n] !=0 )
        {
            return ans[n];
        }
        ans[n] = tribonacci(n-1) + tribonacci(n-2)+ tribonacci(n-3);
        return ans[n];
    }
}