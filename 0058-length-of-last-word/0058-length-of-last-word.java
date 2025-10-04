class Solution {
    public int lengthOfLastWord(String s) {
        int size = 0;
        for(String ss: s.split(" "))
        {
            size = ss.length();
        }
        return size;
    }
}
