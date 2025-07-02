class Solution {
    public int trap(int[] height) {
        int maxi=-1;
        int[] left=new int[height.length];
        for(int i=0;i<height.length;i++)
        {
            if(height[i]>maxi)
            {
                maxi=height[i];
            }
            left[i]=maxi;

        }
        int max=-1;
        int[] right=new int[height.length];
        for(int i=height.length-1;i>=0;i--)
        {
            if(height[i]>max)
            {
                max=height[i];
            }
            right[i]=max;

        }
        int tot=0;
        for(int i=0;i<height.length;i++)
        {
            tot+=(Math.min(left[i],right[i]))-height[i];
        }
        return tot;
    }
}