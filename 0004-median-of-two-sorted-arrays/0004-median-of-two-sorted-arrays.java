class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] arr = new int[n1+n2];
        for(int i = 0;i<n1;i++)
        {
            arr[i] = nums1[i];
        }
        for(int i = 0;i<n2;i++)
        {
            arr[i] = nums2[i];
        }
        Arrays.sort(arr);
        int tot = n1+n2;
        if(tot % 2 == 0)
        {
            int mid  = arr[tot/2];
            double ans = (double)mid;
            return ans-0.5;
        }
        return (double)arr[tot/2];
    }
}