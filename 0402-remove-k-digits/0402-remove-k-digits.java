class Solution {
    public String removeKdigits(String num, int k) {
        int removed=0;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<num.length();i++)
        {   
            char c=num.charAt(i);
            if(stack.isEmpty())
            {
                stack.push(c);
            }
            else 
            {
                while(removed<k && !stack.isEmpty() && stack.peek()>c)
                {
                    stack.pop();
                    removed++;
                }
                stack.push(c);
            }
        }
        while(removed<k)
        {
            removed++;
            stack.pop();
        }
        String s="";
        while(!stack.isEmpty())
        {
            s=stack.pop()+s;
        }
        int nonzeroindex=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                nonzeroindex++;
            }
            else 
            {
                break;
            }
        }
        s=s.substring(nonzeroindex);
        if(s=="")return "0";
        return s;
    }
}