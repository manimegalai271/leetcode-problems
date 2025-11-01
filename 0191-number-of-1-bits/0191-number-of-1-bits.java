class Solution {
    public int hammingWeight(int n) {
        StringBuilder sb = new StringBuilder();
    	if(n == 1)
    	{
    		return 1;
    	}
    	while(n > 1)
    	{
    		sb.append(n % 2);
    		n = n / 2;
    	}
    	if(n == 1)
    	{
    		sb.append('1');
    	}
    	int count = 0;
    	for(int i = 0;i < sb.length();i++)
    	{
    		if(sb.charAt(i) == '1')
    		{
    			count++;
    		}
    	}
    	return count;
    }
}
//Brute force apporach
//Time complexity = o(logn)
//space complexity = o(logn)