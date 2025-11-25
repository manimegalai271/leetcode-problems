class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low = 0;
        int high = 0;
        int max = 0;
        for(int i = 0;i < bloomDay.length;i++)
        {
            if(max < bloomDay[i])
            {
                max = bloomDay[i];
            }
        }
        high = max;
        int bouquetsdays = -1;
        while(low <= high)
        {
            int mid = low + (high - low)/2;
            if(hmanybmake(bloomDay,k,mid) >= m)
            {
                bouquetsdays = mid;
                high = mid -1;
            }
            else 
            {
                low = mid + 1;
            }
        }
        return bouquetsdays;
    }
    public int hmanybmake(int[] bloomDay,int k,int mid)
    {
        int count = 0;
        int bouquets = 0;
        for(int i = 0;i < bloomDay.length;i++)
        {
            if(bloomDay[i] <= mid)
            {
                count++;
            }
            else 
            {
                count = 0;
            }
            if(count == k)
            {
                bouquets++;
                count = 0;
            }
        }
        return bouquets;
    }
}
//Time complexity = o(N log(Max(bloomDay)))