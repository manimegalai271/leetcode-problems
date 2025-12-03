class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color)
        {
            return image;
        }
        int row = image.length;
        int col = image[0].length;
        int source = image[sr][sc];
        if(image[sr][sc] != color)
        {
          
            dfs(image,sr,sc,row,col,source,color);
        }
        return image;
    }
    public void dfs(int[][] image,int sr,int sc,int row,int col,int source,int color)
    {
        if(sr < 0 || sr >= row || sc < 0 || sc >= col)
        {
            return;
        }
        if(image[sr][sc] != source)
        {
            return;
        }
        image[sr][sc] = color;
        dfs(image,sr + 1,sc,row,col,source,color);
        dfs(image,sr - 1,sc,row,col,source,color);
        dfs(image,sr,sc + 1,row,col,source,color);
        dfs(image,sr,sc - 1,row,col,source,color);
    }
}