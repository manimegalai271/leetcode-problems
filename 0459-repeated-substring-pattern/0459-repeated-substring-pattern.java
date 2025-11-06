class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() <= 1) return false;
        // If s is composed by repeating a substring, then s will appear
        // in (s + s) at some index  i where 0 < i < s.length()
        String doubled = s + s;
        // search for s starting from index 1 (skip 0)
        int idx = doubled.indexOf(s, 1);
        return idx != -1 && idx < s.length();
    }
}