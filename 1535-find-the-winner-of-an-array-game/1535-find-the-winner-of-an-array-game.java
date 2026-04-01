class Solution {
    public int getWinner(int[] arr, int k) {
        int max = Math.max(arr[0],arr[1]);
        int count = 0;
        for(int i = 1;i < arr.length;i++)
        {
            if(arr[i] < max)
            {
                count++;
            }
            else
            {
                max = arr[i];
                count = 1;
            }
            if(count == k)
            {
                return max;
            }
        }
        return max;
    }
}