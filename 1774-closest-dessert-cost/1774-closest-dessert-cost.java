class Solution {
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        int closest = Integer.MIN_VALUE;
        for(int cost:baseCosts)
        {
            closest = closestt(cost,0,toppingCosts,target,closest);
        }
        return closest;
    }
    public int closestt(int cost,int i,int[] toppingCosts,int target,int closest)
    {
        if(Math.abs(cost - target) < Math.abs(closest - target) || (Math.abs(cost - target) == Math.abs(closest - target) && cost < closest))
        {
            closest = cost;
        }
        if(i == toppingCosts.length)
        {
            return closest;
        }
        closest = closestt(cost,i + 1,toppingCosts,target,closest);
        closest = closestt(cost + toppingCosts[i],i + 1,toppingCosts,target,closest);
        closest = closestt(cost + (toppingCosts[i] * 2),i + 1,toppingCosts,target,closest);
        return closest;
    }
}