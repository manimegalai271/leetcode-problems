class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int size = 0;
        for(String ss: s.split(" "))
        {
            String org = ss;
            size = org.length();
        }
        return size;
    }
}