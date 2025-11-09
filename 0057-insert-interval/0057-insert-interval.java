class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> ans = new ArrayList<>();
        int index = 0;
        while(index < intervals.length &&  intervals[index][1] < newInterval[0])
        {
            ans.add(intervals[index++]);
        }
        while(index < intervals.length &&  intervals[index][0] <= newInterval[1])
        {
            newInterval[0] = Math.min(intervals[index][0],newInterval[0]);
            newInterval[1] = Math.max(intervals[index][1],newInterval[1]);
            index++;
        }
        ans.add(newInterval);
        while(index < intervals.length &&  intervals[index][1] > newInterval[0])
        {
            ans.add(intervals[index++]);
        }
        return ans.toArray(new int[ans.size()][1]);
    }
}
//Tc = O(n)
//sc = o(n)