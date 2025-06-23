class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] n=new boolean[26];
        for(int i=0;i<sentence.length();i++)
        {
            int ch=sentence.charAt(i);
            if(ch>='a' && ch<='z')
            {
                n[ch-'a']=true;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(n[i]!=true)
            {
                return false;
            }
        }
        return true;
    }
}