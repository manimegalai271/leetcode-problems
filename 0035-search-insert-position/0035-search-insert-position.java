class Solution {
    public int searchInsert(int[] nums, int target) {
        int[] num = new int[nums.length+1];
        for(int i = 0;i < nums.length;i++)
        {
            num[i] = nums[i];
        }
        for(int i = 0;i < nums.length;i++)
        {
            if(nums[i] == target)
            {
                return i;
            }
        }
        num[nums.length] = target;
        Arrays.sort(num);
        for(int i = 0;i < num.length;i++)
        {
            if(num[i] == target)
            {
                return i;
            }
        }
        return 0;
    }
}
//Brute Force Apporach
//Time Complexity = O(nlogn)