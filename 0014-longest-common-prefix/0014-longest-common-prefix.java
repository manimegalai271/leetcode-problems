class Solution {
    public String longestCommonPrefix(String[] strs) {
        String d = "";
        int min = strs[0].length();
        for(String ss:strs)
        {
            min = Math.min(min,ss.length());
        }
        String first = strs[0];
        for(int i = 0;i < min;i++)
        {   
            boolean flag = true;
            for(int j = 1;j < strs.length;j++)
            {
                if(strs[j].charAt(i) != first.charAt(i))
                {
                   flag = false;
                }
            }
            if(flag)
            {
                d += first.charAt(i);
            }
            else 
            {
                break;
            }
        }
        return d;
    }
}