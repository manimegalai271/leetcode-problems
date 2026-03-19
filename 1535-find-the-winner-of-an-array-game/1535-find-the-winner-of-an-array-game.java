class Solution {
    public int getWinner(int[] arr, int k) {
        if(k <= 0)
        {
            return Math.max(arr[0],arr[1]);
        }
        int maxwinner = arr[0] > arr[1]?arr[0]:arr[1];
        int maxconsecutive = 0;
        for(int i = 1;i < arr.length;i++)
        {
            if(maxwinner > arr[i])
            {
               maxconsecutive++;
            }
            else 
            {
                maxwinner = arr[i];
                maxconsecutive = 1;
            }
            if(maxconsecutive == k)
            {
                return maxwinner;
            }
        }
        return maxwinner;
    }
}