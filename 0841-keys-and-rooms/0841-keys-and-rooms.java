class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        visited[0] = true;
        while(!stack.isEmpty())
        {
            int room = stack.pop();
            for(int key:rooms.get(room))
            {
                if(!visited[key])
                {
                    visited[key] = true;
                    stack.push(key);
                }
            }
           
        }
        for(int i = 0;i < visited.length;i++)
        {
            if(!visited[i])
            {
                return false;
            }
        }
        return true;
    }
}