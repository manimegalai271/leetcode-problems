class Solution {
    public void reverseString(char[] s) {
        char[] temp=new char[s.length];
        int o=s.length-1;
        for(int i=0;i<s.length;i++)
        {
            temp[o]=s[i];
            o--;
        }
        for(int i=0;i<s.length;i++)
        {
            s[i]=temp[i];
        }
    }
}