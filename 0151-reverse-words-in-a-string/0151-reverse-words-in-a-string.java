class Solution {
    public String reverseWords(String s) {
        String ans = "";
        for (String ss : s.split("\\s+")) { 
            ans = ss + " " + ans;
        }
        return ans.trim();
    }
}
//Brute force 
//Time = o(n^2) because of o(n) take that full string and another o(n) work on create a new string in each time
//space = o(n) ans string creation

