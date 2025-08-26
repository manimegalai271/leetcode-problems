class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = Arrays.stream(piles)
                     .max()
                     .orElseThrow();
        int left =1;
        int right = max;
        while(left < right)
        {
            int speed =(left+right) /2;
            int totalhrs = 0;
            for(int pile:piles)
            {
                totalhrs += pile / speed +(pile % speed != 0 ? 1:0);
                if(totalhrs>h) break;
            }
            if(totalhrs <= h) right =speed;
            else left = speed+1;
        }
        return left;

          
    }
}