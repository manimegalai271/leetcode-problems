class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Map<int[],Integer> map = new HashMap<>();
        for(int[] point:points)
        {
            int sum  = 0;
            sum += Math.pow(point[0],2) + Math.pow(point[1],2);
            map.put(point,sum);
            sum = 0;
        }
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b)->(map.get(a) - map.get(b)));
        for(int[] c:map.keySet())
        {
            q.add(c);
        }
        List<int[]> l = new ArrayList<>();
        int index = 0;
        while(!q.isEmpty())
        {
            if(k-- > 0)
            {
                l.add(q.poll());
            }
            else 
            {
                break;
            }
        }
        return l.toArray(new int[l.size()][]);
    }
}