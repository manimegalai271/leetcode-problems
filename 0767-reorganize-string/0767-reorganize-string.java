class Solution {
    public String reorganizeString(String s) {

        int[] hash = new int[26];

        // Count frequency
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        // Find the character with maximum frequency
        int max = 0, letter = 0;
        for (int i = 0; i < 26; i++) {
            if (hash[i] > max) {
                max = hash[i];
                letter = i;
            }
        }

        // If not possible to reorganize
        if (max > (s.length() + 1) / 2) return "";

        char[] res = new char[s.length()];

        // Fill even indices with the most frequent character
        int idx = 0;
        while (hash[letter]-- > 0) {
            res[idx] = (char) (letter + 'a');
            idx += 2;
        }

        // Fill remaining characters
        for (int i = 0; i < 26; i++) {
            while (hash[i]-- > 0) {
                if (idx >= res.length) idx = 1;
                res[idx] = (char) (i + 'a');
                idx += 2;
            }
        }

        return String.valueOf(res);
    }
}
