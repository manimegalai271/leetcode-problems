class Solution {
    public boolean isValid(String s) {
		Stack<Character> ch=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
		    if(s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='(')
		    {
		        ch.push(s.charAt(i));
		    }
		    else 
		    {
		        if(ch.isEmpty())
		        {
		            return false;
		        }
		        else if(s.charAt(i)==']')
		        {
		            if(ch.peek()=='[')
		            {
		                ch.pop();
		            }
		            else 
		            {
		                return false;
		            }
		        }
		        else if(s.charAt(i)==')')
		        {
		            if(ch.peek()=='(')
		            {
		                ch.pop();
		            }
		            else 
		            {
		                return false;
		            }
		        }
		        else if(s.charAt(i)=='}')
		        {
		            if(ch.peek()=='{')
		            {
		                ch.pop();
		            }
		            else 
		            {
		                return false;
		            }
		        }
		    }
		}
		if(ch.isEmpty())
		{
		    return true;
		}
		else 
		{
		    return false;
		}
    }
}