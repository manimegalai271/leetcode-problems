class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int imbalance = 0;
        for(int i = 0;i < s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                stack.push('(');
            }
            else if(s.charAt(i) == ')')
            {
                if(stack.size() > 0)
                {
                    stack.pop();
                }
                else
                {
                    imbalance++;
                }
            }
        }
        return stack.size() + imbalance;
    }
}
