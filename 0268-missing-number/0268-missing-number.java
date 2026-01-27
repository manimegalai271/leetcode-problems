class Solution {
    public int missingNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int num:nums)
        {
            list.add(num);
        }
        int n = nums.length;
        for(int i = 0;i <= n;i++)
        {
            if(!list.contains(i))
            {
                return i;
            }
        }
        return 0;
    }
}