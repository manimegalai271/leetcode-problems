class Solution {
    public int myAtoi(String s) {
        if(s == null)return 0;
        s = s.trim();
        int i = 0;
        if(s.length() == 0)return 0;
        int sign = +1;
        if(s.charAt(0) == '-')
        {
            sign = -1;
            i++;
        }
        else if(s.charAt(0) == '+')
        {
            i++;
        }
        long ans = 0;
        int max = Integer.MAX_VALUE,min = Integer.MIN_VALUE;
        while(i < s.length())
        {   
            char ch = s.charAt(i);
            if(!Character.isDigit(ch))
            {
                break;
            }
            ans = ans*10 + s.charAt(i)-'0';
            if(sign ==1 && ans >max)return max;
            else if(sign == -1 && ans<min) return min;
            
            i++;
        }
        return (int) (sign*ans);

    }
}