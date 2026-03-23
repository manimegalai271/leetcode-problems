class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int count = 0;
        for(int i = 0;i < s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                stack.push(count);
                count = 0;
            }
            else 
            {
                count = stack.pop()+Math.max(2 * count,1);
            }
        }
        return count;
    }
}