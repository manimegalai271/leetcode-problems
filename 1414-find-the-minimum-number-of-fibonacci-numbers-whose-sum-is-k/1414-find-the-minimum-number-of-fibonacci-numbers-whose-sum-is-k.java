class Solution {
    public int findMinFibonacciNumbers(int k) {
        List<Integer> fib = new ArrayList<>();
        int n1 = 0;
        int n2 = 1;
        fib.add(n1);
        fib.add(n2);
        while(n2 < k)
        {
            int temp = n2;
            n2 = n1 + n2;
            n1 = temp;
            fib.add(n2);
        }
        int size = fib.size();
        if(fib.get(size - 1) == k)
        {
            return 1;
        }
        int count = 0;
        for(int i = size - 2;i >= 0;i--)
        {
            if(fib.get(i) <= k)
            {
                k -= fib.get(i);
                count++;
            }
            if(k == 0)
            {
                return count;
            }
        }
        return count;
    }

}