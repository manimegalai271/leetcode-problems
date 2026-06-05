class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int costt = 0;
        int total = 0;
        int ans = 0;
        for(int i = 0;i < gas.length;i++)
        {
           costt += gas[i] - cost[i];
           total += gas[i] - cost[i];
           if(costt < 0)
           {
              ans = i + 1;
              costt = 0;
           }
        }
        return total >= 0?ans:-1;
    }
}