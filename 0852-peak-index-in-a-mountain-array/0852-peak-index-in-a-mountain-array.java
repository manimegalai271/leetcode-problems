class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int curr = 0;
        for(int i = 1;i < arr.length;i++)
        {
            if(arr[curr] < arr[i])
            {
                curr = i;
            }
            else 
            {
                return curr;
            }
        }
        return curr;
    }
}