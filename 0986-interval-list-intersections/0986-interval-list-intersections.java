class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> ans = new ArrayList<>();
        int first = 0;
        int second = 0;
        while(first < firstList.length && second < secondList.length)
        {   
            if(firstList[first][1] >= secondList[second][0] && firstList[first][0] <= secondList[second][1])
            {
               int m1 = Math.max(firstList[first][0],secondList[second][0]);
               int m2 = Math.min(firstList[first][1],secondList[second][1]);
               int[] res = new int[2];
               res[0] = m1;
               res[1] = m2;
               ans.add(res);
            }
            if(firstList[first][1] <= secondList[second][1])
            {
                first++;
            }
            else 
            {
                second++;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}