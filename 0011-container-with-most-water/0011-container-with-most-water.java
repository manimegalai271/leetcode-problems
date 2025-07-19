class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int ans=-1;
        while(left<right)
        {
            ans=Math.max((right-left)*(Math.min(height[left],height[right])),ans);
            if(height[left]<height[right])
            {
                left++;
            }
            else 
            {
                right--;
            }
        }
        return ans;
    }
}