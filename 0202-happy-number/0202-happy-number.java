class Solution {
    public int compute(int n)
       {
        int res =0;
        while(n != 0)
        {
            res = res+((n%10) * (n % 10));
            n /=10;
        }
        return res;
       }
    public boolean isHappy(int n) {
       int slow = n,fast =n;
       do{
        slow = compute(slow);
        fast =compute(fast);
        fast =compute(fast);
       }while(slow != fast);
       if(slow == 1) return true;
       return false;

    }
}