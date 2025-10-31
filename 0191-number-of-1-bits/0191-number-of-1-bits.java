class Solution {
    public int hammingWeight(int n) {
        String s = "";
    	if(n == 1)
    	{
    		return 1;
    	}
    	while(n > 1)
    	{
    		s = n % 2 + s;
    		n = n / 2;
    	}
    	if(n == 1)
    	{
    		s = '1' + s;
    	}
    	int count = 0;
    	for(int i = 0;i < s.length();i++)
    	{
    		if(s.charAt(i) == '1')
    		{
    			count++;
    		}
    	}
    	return count;
    }
}