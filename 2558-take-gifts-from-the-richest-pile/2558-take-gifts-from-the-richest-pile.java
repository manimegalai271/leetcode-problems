class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n = gifts.length-1;
        while(k-- != 0)
        {   
            Arrays.sort(gifts);
            gifts[n] = (int)Math.sqrt(gifts[n]);
        }
        long ans = 0;
        for(int i = 0;i < gifts.length;i++)
        {
           ans += (long)gifts[i];
        }
        return ans;
    }
}