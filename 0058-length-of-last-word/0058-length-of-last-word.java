class Solution {
    public int lengthOfLastWord(String s) {
        //s = s.trim();
        int size = 0;
        for(String ss: s.split(" "))
        {
            size = ss.length();
        }
        return size;
    }
}
