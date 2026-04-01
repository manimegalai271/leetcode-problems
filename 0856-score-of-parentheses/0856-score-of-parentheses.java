class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> ss = new Stack<>();
        int count = 0;
        for(int i = 0;i < s.length();i++)
        {
            if(s.charAt(i) == '(')
            {
                ss.push(count);
                count = 0;
            }
            else 
            {
                count = ss.pop()+Math.max(1,(2 * count));
            }
        }
        return count;
    }
}