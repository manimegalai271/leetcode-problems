class Solution {
    public boolean exist(char[][] board, String word) {
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if (word.charAt(0) == board[row][col]) {
                    if (wordSearch(word, board, row, col, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean wordSearch(String word, char[][] board, int row, int col, int position) {
        // base condition: word found completely
        if (position == word.length()) {
            return true;
        }

        // check out of boundary or invalid state
        if (row < 0 || row >= board.length || 
            col < 0 || col >= board[0].length || 
            board[row][col] != word.charAt(position)) {
            return false;
        }

        // temporarily mark the cell as visited
        char temp = board[row][col];
        board[row][col] = '$';

        // explore in all 4 directions
        boolean left = wordSearch(word, board, row, col - 1, position + 1);
        boolean right = wordSearch(word, board, row, col + 1, position + 1);
        boolean up = wordSearch(word, board, row - 1, col, position + 1);
        boolean down = wordSearch(word, board, row + 1, col, position + 1);

        // restore the cell back
        board[row][col] = temp;

        return left || right || up || down;
    }
}
