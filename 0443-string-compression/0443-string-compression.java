class Solution {
    public int compress(char[] chars) {
        int i = 0; // position to write compressed result
        
        for (int j = 1, count = 1; j <= chars.length; j++, count++) {
            // when current char is different from previous OR end of array
            if (j == chars.length || chars[j] != chars[j - 1]) {
                chars[i++] = chars[j - 1]; // write the character
                
                // if count > 1, convert count to string and write each digit
                if (count > 1) {
                    for (char digit : String.valueOf(count).toCharArray()) {
                        chars[i++] = digit;
                    }
                }
                count = 0; // reset count for next group
            }
        }
        return i; // new length of compressed array
    }
}
