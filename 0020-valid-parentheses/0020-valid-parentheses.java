class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> hm=new HashMap(){{
            put('}','{');
            put(']','[');
            put(')','(');
        }};
        Stack<Character> p=new Stack();
        char ch[] = s.toCharArray();
        for(char c:ch)
        {
           if(c == '(' || c=='{' || c=='[')
           {
            p.push(c);
           }
           else if(p.isEmpty() || p.pop()!=hm.get(c))
           {
            return false;
           }
        }
        return p.isEmpty();

        
    }
}