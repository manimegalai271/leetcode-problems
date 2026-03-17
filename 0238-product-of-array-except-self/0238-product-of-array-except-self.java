class Solution {
    public int[] productExceptSelf(int[] num) {
        int[] ans = new int[num.length];
        int total_product = 1;
        int zero_count = 0;
        int mul = 1;
        for(int i = 0;i < num.length;i++)
        {
            if(num[i] == 0)
            {
                zero_count++;
            }
            else if(num[i] != 0)
            {
                mul *= num[i];
            }
            total_product *= num[i];
        }
        for(int i = 0;i < ans.length;i++)
        {   
            if(zero_count == 1 && num[i] == 0)
            {
                ans[i] = mul;
            }
            if(total_product != 0 && zero_count != 1)
            {
                ans[i] = total_product / num[i];
            }
            
        }
        return ans;
    }
}
