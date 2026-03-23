class Solution {
    public int minCharacters(String a, String b) {
        int[] freqa = new int[26];
        int[] freqb = new int[26];
        for(int i = 0;i < a.length();i++)
        {
            freqa[a.charAt(i) - 'a']++;
        }
        for(int i = 0;i < b.length();i++)
        {
            freqb[b.charAt(i) - 'a']++;
        }
        int sum1 = 0;
        int sum2 = 0;
        int n = a.length();
        int m = b.length();
        int min = Integer.MAX_VALUE;
        for(int i = 0;i < 25;i++)
        {   
            sum1 += freqa[i];
            sum2 += freqb[i];
            min = Math.min(min,sum1-sum2+m);
            min = Math.min(min,sum2-sum1+n);
            
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i < 26;i++)
        {
           max = Math.max(freqa[i]+freqb[i],max);
        }
        return Math.min(min,m+n-max);
    }
}