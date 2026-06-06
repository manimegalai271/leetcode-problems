class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = strs[0].length();
        int idx = -1;
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
                idx = i;
            }
            else 
            {
                break;
            }
        }
        return idx == -1 ?"":strs[0].substring(0,idx + 1);
    }
}