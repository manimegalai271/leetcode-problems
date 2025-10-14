class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] ch = s.trim().split("\\s+");
        for(int i = ch.length-1;i >= 0; i--)
        {
            sb.append(ch[i]);
            if(i > 0)
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
//optimize 
//Time = o(n) 
//space = o(n) ch  string

