class Solution {
    public int[] resultsArray(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        for(int i = 0;i < n - k + 1;i++)
        {
            int max = nums[i];
            Boolean isconsecutive = true;
            for(int j = i;j < i + k - 1;j++)
            {
                if(nums[j]+1 != nums[j+1])
                {
                    isconsecutive = false;
                    break;
                }
                max =nums[j + 1];
            }
            ans[i] = isconsecutive?max:-1; 
        }
        return ans;
    }
}