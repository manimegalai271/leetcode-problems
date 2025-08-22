class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalcost=0,n=gas.length;
        int ans=0,currGain =0;
        for(int i=0;i<n;i++)
        {
            totalcost+=gas[i]-cost[i];
            currGain = currGain + gas[i] - cost[i];
            if(currGain <0)
            {
                ans=i+1;
                currGain = 0;
            }
        }
        return totalcost >= 0 ? ans : -1;
    }
}