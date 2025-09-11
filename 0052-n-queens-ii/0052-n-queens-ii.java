class Solution {
    boolean canPlace(int row, int col, List<String> curr) {
        for (int i = row - 1; i >= 0; i--)
            if (curr.get(i).charAt(col) == 'Q')
                return false;

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--)
            if (curr.get(i).charAt(j) == 'Q')
                return false;

        for (int i = row - 1, j = col + 1; i >= 0 && j < curr.size(); i--, j++)
            if (curr.get(i).charAt(j) == 'Q')
                return false;

        return true;
    }

    void backtrack(int row, List<String> curr, List<List<String>> res) {
        if (row == curr.size()) {
            res.add(new ArrayList<>(curr));
            return;
        }

        int n = curr.size();
        for (int col = 0; col < n; col++) {
            if (canPlace(row, col, curr)) {
                char[] rowArr = curr.get(row).toCharArray();
                rowArr[col] = 'Q';
                curr.set(row, new String(rowArr));

                backtrack(row + 1, curr, res);

                rowArr[col] = '.';
                curr.set(row, new String(rowArr));
            }
        }
    }
    public int totalNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        List<String> curr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            char[] row = new char[n];
            Arrays.fill(row, '.');
            curr.add(new String(row));
        }

        backtrack(0, curr, res);
        return res.size();
    }
}