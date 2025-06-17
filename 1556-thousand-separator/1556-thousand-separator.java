class Solution {
    public String thousandSeparator(int n) {
        if(n>=0 && n<=999)
        {
               return String.valueOf(n);
        }
        String s="";
        int count=0;
        while(n>0)
        {   
            s=n%10+s;
            count++;
            n/=10;
            if(count==3 && n>0)
            {
                s='.'+s;
                count=0;
            }
            
        }
        return s;
        
    }
}