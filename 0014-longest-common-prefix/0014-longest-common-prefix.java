class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1)
        {
            return strs[0];
        }
        int currentIndex=0;
        String str="";
        while(true)
        {
            for(int i=0;i<strs.length-1;i++)
            {
                if(currentIndex>=strs[i].length() || currentIndex>=strs[i+1].length()|| strs[i].charAt(currentIndex)!=strs[i+1].charAt(currentIndex))
                {
                    return str;
                }
            }
            str=str+strs[0].charAt(currentIndex);
            currentIndex++;

        }
    }
}