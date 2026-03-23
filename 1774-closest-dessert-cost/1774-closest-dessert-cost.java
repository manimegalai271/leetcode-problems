class Solution {
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        int closest = Integer.MAX_VALUE;
        for(int base:baseCosts)
        {
            closest =  close(closest,base,0,toppingCosts,target);
        }
        return closest;
    }
    public int close(int closes,int cost,int i,int[] toppingCosts,int target)
    {
        if(Math.abs(cost - target) < Math.abs(closes - target) ||(Math.abs(cost - target) == Math.abs(closes - target) && cost < closes))
        {
            closes = cost;
        }
        if(i == toppingCosts.length)return closes;

        closes = close(closes,cost,i+1,toppingCosts,target);
        closes = close(closes,cost+toppingCosts[i],i+1,toppingCosts,target);
        closes = close(closes,cost+toppingCosts[i] * 2,i+1,toppingCosts,target);

        return closes;
        
    }
}