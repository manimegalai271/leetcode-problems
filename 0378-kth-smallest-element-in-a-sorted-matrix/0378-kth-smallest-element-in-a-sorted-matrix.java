class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0;i < matrix.length;i++)
        {
            for(int j = 0;j < matrix[i].length;j++)
            {
                ans.add(matrix[i][j]);
            }
        }
        Collections.sort(ans);
        return ans.get(k-1);
    }
}
//Time complexity = o(N * M log(N * M))
//space complexity = O(N * M)