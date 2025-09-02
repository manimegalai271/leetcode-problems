class Solution {
    public int fib(int n) {
        double sqrt5 = Math.sqrt(5);
        double phi = (1 + sqrt5) / 2;       // golden ratio
        double psi = (1 - sqrt5) / 2;       // conjugate of phi
        return (int) Math.round((Math.pow(phi, n) - Math.pow(psi, n)) / sqrt5);
    }
}
