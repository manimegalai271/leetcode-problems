class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(n<0)
        {
            x=1/x;
            N=-N;
        }
        double ans=1.0;
        while(N>0)
        {
            if(N%2==1)
            {
                ans=ans*x;
            }
            x=x*x;
            N/=2;
        }
        return ans;
    }
}
