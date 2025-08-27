class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max =-1;
        for(int i = 0;i<piles.length;i++)
        {
            if(piles[i]>max)
            {
                max = piles[i];
            }
        }
        int left =1;
        int right =max;
		while(left < right)
		{    
             int speed = (left+right) /2;
		     int ans =0;
		     for(int i=0;i<piles.length;i++)
		     {
		        ans += piles[i]/speed +(piles[i]%speed != 0 ? 1:0);
                if(ans > h) break;
	         }
	         if(ans <= h)
	         {
	             right =speed;
	         }
	         else 
	         {
	             left = speed+1;
	         }
		}
        return left;
          
    }
}