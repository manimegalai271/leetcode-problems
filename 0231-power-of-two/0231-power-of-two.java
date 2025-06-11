class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>=1 && Integer.MIN_VALUE%n==0;
    }
}