class Solution {
    public int getWinner(int[] arr, int k) {
        if(k <= 0)
        {
            return Math.max(arr[0],arr[1]);
        }
        int max_count = arr[0] > arr[1]?arr[0]:arr[1];
        int count = 0;
        for(int i = 1;i < arr.length;i++)
        {
            if(max_count > arr[i])
            {
                count++;
            }
            else
            {
                max_count = arr[i];
                count = 1;
            }
            if(count == k)
            {
                return max_count;
            }
        }
        return max_count;
    }
}
