class Solution {
    public int costt(int cost,int closest,int i,int[] toppingCosts,int target)
    {
        if (Math.abs(cost - target) < Math.abs(closest - target) ||
           (Math.abs(cost - target) == Math.abs(closest - target) && cost < closest)) {
            closest = cost;
        }
         if(i == toppingCosts.length)
         {
             return closest;
         }

         closest = costt(cost,closest,i+1,toppingCosts,target);
         closest = costt(cost+toppingCosts[i],closest,i+1,toppingCosts,target);
         closest = costt(cost+(toppingCosts[i] * 2),closest,i+1,toppingCosts,target);

         return closest;
    }
    public int closestCost(int[] baseCosts, int[] toppingCosts, int target) {
        int closest = Integer.MAX_VALUE;
        for(int base:baseCosts)
        {
            closest = costt(base,closest,0,toppingCosts,target);
        }
        return closest;
    }
}