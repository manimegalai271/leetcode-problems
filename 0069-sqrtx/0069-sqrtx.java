class Solution {
    public int mySqrt(int x) {
        long left=1;
        long right=x;
        int ans=0;
        while(left<=right)
        {
            long mid=(left+right)/2;
            if(mid*mid==x)
            {
                return (int)mid;
            }
            else if(mid*mid>=x)
            {
                right=mid-1;
            }
            else if(mid*mid<=x)
            {
                left=mid+1;
                ans=(int)mid;
            }
        }
        return (int)ans;
    }
}