class Solution {
    int[] f = new int[46]; // enough for n ≤ 45

    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        if (f[n] != 0) return f[n];

        f[n] = climbStairs(n - 1) + climbStairs(n - 2);
        return f[n];
    }
}
