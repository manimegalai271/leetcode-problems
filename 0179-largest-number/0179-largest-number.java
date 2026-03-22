class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for(int i = 0;i < nums.length;i++)
        {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr,(a,b)->(a+b).compareTo(b+a));
        if(arr[nums.length - 1].equals("0"))return "0";
        StringBuilder sb = new StringBuilder();
        for(int i = nums.length - 1;i >= 0;i--)
        {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
