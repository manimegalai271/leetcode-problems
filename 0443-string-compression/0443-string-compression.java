class Solution {
    public int compress(char[] chars) {
        int i = 0;
        int count = 1;
        
        for (int j = 1; j <= chars.length; j++, count++) {
            if (j == chars.length || chars[j] != chars[j - 1]) {
                chars[i++] = chars[j - 1];
                if (count >= 2) {
                    for (char c : Integer.toString(count).toCharArray()) {
                        chars[i++] = c;
                    }
                }
                count = 0;
            }
        }
        return i;
    }
}