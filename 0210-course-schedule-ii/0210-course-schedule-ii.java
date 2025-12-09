class Solution {
    public boolean dfs(List<List<Integer>> graph, int[] colors, List<Integer> res, int i) {
        colors[i] = 1; // visiting
        
        for (int neighbor : graph.get(i)) {
            if (colors[neighbor] == 1) return true; // cycle found
            if (colors[neighbor] == 0) {
                if (dfs(graph, colors, res, neighbor)) return true;    
            }
        }
        
        colors[i] = 2;  
        res.add(i);
        return false;
    }
    
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] colors = new int[numCourses];
        List<List<Integer>> graph = new ArrayList<>();
        
        for (int i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }
        
        // build graph
        for (int[] pre : prerequisites) {
            graph.get(pre[0]).add(pre[1]);
        }
        
        List<Integer> res = new ArrayList<>();
        
        for (int i = 0; i < numCourses; i++) {
            if (colors[i] == 0) {
                if (dfs(graph, colors, res, i)) return new int[0];
            }
        }
        
        // convert List to array
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) ans[i] = res.get(i);
        
        return ans;
    }
}
