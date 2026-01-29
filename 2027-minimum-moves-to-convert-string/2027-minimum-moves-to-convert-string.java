class Solution {
    public int minimumMoves(String s) {
        int moves = 0;
        int i = 0;

        while (i < s.length()) {
            if (s.charAt(i) == 'X') {
                moves++;
                i += 3;   // convert this and next two characters
            } else {
                i++;
            }
        }

        return moves;
    }
}