class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0) return 0;
        int maxArea = 0;
        int rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == '1') {
                    int minWidth = Integer.MAX_VALUE;
                    for (int k = i; k < rows && matrix[k][j] == '1'; k++) {
                        int width = 0;
                        for (int l = j; l < cols && matrix[k][l] == '1'; l++) {
                            width++;
                        }
                        minWidth = Math.min(minWidth, width);
                        int height = k - i + 1;
                        maxArea = Math.max(maxArea, minWidth * height);
                    }
                }
            }
        }
        return maxArea;
    }
}