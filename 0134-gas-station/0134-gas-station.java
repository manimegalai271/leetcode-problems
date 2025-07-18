class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ans=0;
        for(int i=0;i<gas.length;i++)
        {
            ans+=gas[i]-cost[i];
        }
        if(ans<0)
        {
            return -1;
        }
        int startIndex=0;
        int remindergas=0;
        for(int i=0;i<gas.length;i++)
        {
            int currentgas=gas[i]+remindergas;
            int currentcost=cost[i];
            remindergas=currentgas-currentcost;
            if(remindergas<0)
            {
              
                remindergas=0;
                startIndex=i+1;
            }
        }
        return startIndex;
    }
}