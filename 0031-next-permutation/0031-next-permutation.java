import java.util.*;
class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1])
        {
            i--;
        } 
        if(i>=0)
        {   int j=n-1;
            while(j>=0 && nums[i]>=nums[j])
            {
                j--;
            }
            swap(nums,i,j);
        }
        rev(nums,i+1,n-1);
        
    }
    public static void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static void rev(int[] nums,int i,int j)
    {
        while(i<j)
        {
            swap(nums,i++,j--);
        }
    }
}