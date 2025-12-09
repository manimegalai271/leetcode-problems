class Solution {
    Set<Integer> visited = new HashSet<>();
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,List<Integer>> graph = new HashMap<>();
        for(int[] edge:edges)
        {
            int v = edge[0];
            int u = edge[1];
            if(!graph.containsKey(v))graph.put(v,new ArrayList<>());
            if(!graph.containsKey(u))graph.put(u,new ArrayList<>());

            graph.get(v).add(u);
            graph.get(u).add(v);
        }
        return dfs(graph,source,destination);
    }
    public boolean dfs(Map<Integer,List<Integer>> graph,int source, int destination)
    {
        if(source == destination)return true;
        if(!graph.containsKey(source))return false;
        if(visited.contains(source))return false;
        visited.add(source);
        boolean ans = false;
        for(int vv:graph.get(source))
        {
            ans = ans || dfs(graph,vv,destination);
        }
        return ans;
    }
}