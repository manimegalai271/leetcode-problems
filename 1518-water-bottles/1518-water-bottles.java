class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int fullbottles=numBottles;
        int emptybottles=0;
        int drink=0;
        while(fullbottles>=1)
        {
            drink+=fullbottles;
            emptybottles+=fullbottles;
            fullbottles=emptybottles/numExchange;
            emptybottles=emptybottles%numExchange;
        }
        return drink;
    }
}