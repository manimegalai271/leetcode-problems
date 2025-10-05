import java.util.*;

class Solution {
    int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];

        // Pacific: top row & left column
        for (int i = 0; i < m; i++) dfs(heights, pacific, i, 0);
        for (int j = 0; j < n; j++) dfs(heights, pacific, 0, j);

        // Atlantic: bottom row & right column
        for (int i = 0; i < m; i++) dfs(heights, atlantic, i, n - 1);
        for (int j = 0; j < n; j++) dfs(heights, atlantic, m - 1, j);

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }
        return res;
    }

    private void dfs(int[][] h, boolean[][] visited, int i, int j) {
        visited[i][j] = true;
        for (int[] d : directions) {
            int x = i + d[0], y = j + d[1];
            if (x >= 0 && y >= 0 && x < h.length && y < h[0].length &&
                !visited[x][y] && h[x][y] >= h[i][j]) {
                dfs(h, visited, x, y);
            }
        }
    }
}
//tc -o(m*n)