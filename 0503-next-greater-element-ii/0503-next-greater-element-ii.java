class Solution {
    public int[] nextGreaterElements(int[] nums) {
        //Stack<Integer> s=new Stack<>();
        Deque<Integer> s=new ArrayDeque();
        int n=nums.length;
        int[] res=new int[n];
        Arrays.fill(res,-1);
        for(int i=0;i<2*n;i++)
        {
            while(!s.isEmpty() && nums[s.peek()] < nums[i%n])
            {
                res[s.pop()]=nums[i%n];
            }
            s.push(i%n);
        }
        return res;
    }
}