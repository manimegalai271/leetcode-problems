class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0;i < nums.length;i++)
        { 
            nums[i] = (int)Math.pow(nums[i],2);

        }
        Arrays.sort(nums);
        return nums;
    }
}
//Brute force apporach
//Time complexity = o(nlogn)
//space complexity = o(1)