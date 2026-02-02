class Solution {
    public int reverse(int x) {
        boolean negative = x < 0;
        x = Math.abs(x);
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        sb.reverse();
        try 
        {
            
	        int rev = Integer.parseInt(sb.toString());
            return negative?-rev:rev;
        }
        catch(Exception e)
        {
            return 0;
        }
    }
}