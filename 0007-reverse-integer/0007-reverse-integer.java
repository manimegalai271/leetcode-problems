class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!=0)
        {
           rev=rev*10+x%10;
           x/=10;
           
           if(rev< Integer.MIN_VALUE || rev>Integer.MAX_VALUE)
           {
            return 0;
           }
        }
        return rev;
    }
}