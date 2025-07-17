class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        List<int[]> list=new ArrayList<>();
        int index=0;
        while(index<intervals.length)
        {
            int newstart=intervals[index][0];
            int currentend=intervals[index][1];
            while(index<intervals.length-1 && currentend>=intervals[index+1][0])
            {
                currentend=Math.max(currentend,intervals[index+1][1]);
                index++;
            }
            int newend=currentend;
            list.add(new int[] {newstart,newend});
            index+=1;
        }
        int[][] org=new int[list.size()][2];
        int i=0;
        for(int[] arr:list)
        {
          org[i++]=arr;
        }
        return org;
        
    }
}