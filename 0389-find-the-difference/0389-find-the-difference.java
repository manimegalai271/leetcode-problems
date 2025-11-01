class Solution {
    public char findTheDifference(String s, String t) {
        StringBuilder tBuilder = new StringBuilder(t);
        
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // find and remove the matching char in t
            for (int j = 0; j < tBuilder.length(); j++) {
                if (tBuilder.charAt(j) == ch) {
                    tBuilder.deleteCharAt(j);
                    break;
                }
            }
        }
        
        // Remaining character is the extra one
        return tBuilder.charAt(0);
    }
}
