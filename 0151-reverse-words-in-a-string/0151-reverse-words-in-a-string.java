class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String ans = "";
        for (String ss : s.split("\\s+")) { 
            ans = ss + " " + ans;
        }
        return ans.trim();
    }
}
