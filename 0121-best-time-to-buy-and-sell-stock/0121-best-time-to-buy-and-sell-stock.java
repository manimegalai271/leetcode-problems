class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int price=prices[0];
        int profit=price-minprice;
        int maxprofit=profit;
        for(int i=0;i<prices.length;i++)
        {
           if(prices[i]<minprice)
           {
               minprice=prices[i];
               profit=prices[i]-minprice;
           }
           else
           {   
               profit=prices[i]-minprice;
               if(profit>maxprofit)
               {
                   maxprofit=profit;
               }
               
           }
        }
        return maxprofit;
    }
}