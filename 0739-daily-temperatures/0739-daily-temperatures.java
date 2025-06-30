class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s=new Stack<Integer>();
        int[] org=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++)
        {
            if(s.size()==0 || temperatures[s.peek()]>=temperatures[i])
            {
                s.push(i);
            }
            else 
            {
                while(s.size()>0 && temperatures[s.peek()]<temperatures[i])
                {
                    int last=s.pop();
                    org[last]=i-last;
                }
                s.push(i);
            }
        }
        return org;
    }
}