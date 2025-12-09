class Solution {
    public boolean dfs(List<Integer> res,List<List<Integer>> graph,int[] colors,int i)
    {
        colors[i] = 1;
        for(int neighbor:graph.get(i))
        {
            if(colors[neighbor] == 1)return true;
            if(colors[neighbor] == 0)
            {
                if(dfs(res,graph,colors,neighbor))return true;
            }
        }
        colors[i] = 2;
        res.add(i);
        return false;
    }
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] colors = new int[numCourses];
        List<List<Integer>> graph = new ArrayList<>();
        for(int i = 0;i < numCourses;i++)
        {
            graph.add(new ArrayList<>());
        }
        for(int pre[]:prerequisites)
        {
            graph.get(pre[0]).add(pre[1]);
        }
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i < numCourses;i++)
        {
            if(colors[i] == 0)
            {
                if(dfs(res,graph,colors,i))return new int[0];
            }
        }
        int[] ans = new int[res.size()];
        for(int i = 0;i < res.size();i++)
        {
            ans[i]= res.get(i);
        }
        return ans;
    }
}