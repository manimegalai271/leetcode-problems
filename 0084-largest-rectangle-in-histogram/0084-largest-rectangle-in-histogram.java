class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxarea = 0;
        for(int i = 0;i <= n;i++)
        {
            int h = (i == n) ? 0 : heights[i];
            while(!stack.isEmpty() && h < heights[stack.peek()])
            {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ?i:i-stack.peek()-1;
                int area = height * width;
                maxarea = Math.max(area,maxarea);
            }
            stack.push(i);
        }
        return maxarea;
    }
}