class Solution {
    Map<String,Integer> map = new HashMap<>();
    public int Invalidp(String s)
    {   
        Stack<String> stack = new Stack();
        for(int i = 0;i < s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                stack.push("(");
            }
            else if(s.charAt(i) == ')')
            {
                if(!stack.isEmpty() && stack.peek() == "(")
                {
                    stack.pop();
                }
                else 
                {
                    stack.push(")");
                }
            }
        }
        return stack.size();
    }
    public void getparentheses(List<String> ans,String s,int min)
    {   
        if(map.containsKey(s))
        {
            return;
        }
        else 
        {
            map.put(s,1);
        }
        if(min < 0)
        {
            return;
        }
        if(min == 0)
        {
            if(Invalidp(s) == 0)
            {
                ans.add(s);
                return;
            }
        }
        for(int i = 0;i < s.length();i++)
        {
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            getparentheses(ans,left+right,min-1);
        }

    }
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans = new ArrayList();
        getparentheses(ans,s,Invalidp(s));
        return ans;
    }
}