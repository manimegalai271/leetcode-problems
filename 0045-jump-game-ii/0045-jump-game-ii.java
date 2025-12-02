class Solution {
    public int jump(int[] nums) {
        if(nums.length == 1)return 0;
        int minjumpcount = 0;
        int destination = nums.length - 1;
        int coverage = 0;
        int lastjump = 0;
        for(int i = 0;i < nums.length;i++)
        {
            coverage = Math.max(coverage,i + nums[i]);
            if(i == lastjump)
            {
                minjumpcount++;
                lastjump = coverage;
                if(coverage >= destination)
                {
                    return minjumpcount;
                }
            }
        }
        return 0;
    }
}