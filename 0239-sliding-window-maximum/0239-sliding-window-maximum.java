class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        if(k == 1 || n == 1)
        {
            return nums;
        }
        int[] ans = new int[n - k + 1];
        Deque<Integer> q = new ArrayDeque<>();
        for(int i = 0;i < k;i++)
        {
            while(!q.isEmpty() && nums[q.peekLast()] <= nums[i])
            {
                q.pollLast();
            }
            q.offerLast(i);
        }
        int j = 0;
        ans[j++] = nums[q.peekFirst()];
        for(int i = k;i < n;i++)
        {   
            while(!q.isEmpty() && q.peekFirst() <= i-k)
            {
                q.pollFirst();
            }
            while(!q.isEmpty() && nums[q.peekLast()] <= nums[i])
            {
                q.pollLast();
            }
            q.offerLast(i);
            ans[j++] = nums[q.peekFirst()];
        }
        return ans;
    }
}