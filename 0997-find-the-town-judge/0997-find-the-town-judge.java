class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustarray=new int[n+1];
        for(int i=0;i<trust.length;i++)
        {
            trustarray[trust[i][0]]-=1;
            trustarray[trust[i][1]]+=1;
        }
        for(int i=1;i<trustarray.length;i++)
        {
            if(trustarray[i]==n-1)
            {
                return i;
            }
        }
        return -1;
    }
}