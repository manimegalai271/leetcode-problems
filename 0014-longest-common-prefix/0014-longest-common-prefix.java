class Solution {
    public String longestCommonPrefix(String[] strs) {
        int currentIdx = 0;
        if(strs.length == 1)
        {
            return strs[0];
        }
        String ans = "";
        while(true)
        {
            for(int i = 0;i < strs.length - 1;i++)
            {
                if(currentIdx >= strs[i].length() || currentIdx >= strs[i+1].length() || strs[i].charAt(currentIdx) != strs[i+1].charAt(currentIdx))
                {
                    return ans;
                }
            }
            ans = ans + strs[0].charAt(currentIdx);
            currentIdx++;
        }
        
    }
}