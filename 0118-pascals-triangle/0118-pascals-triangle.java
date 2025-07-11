class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list=new ArrayList<>();
       
        for(int i=0;i<numRows;i++)
        {
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                if(j==0 || j==i)
                {
                    row.add(1);
                }
                else 
                {
                    List<Integer> previous=list.get(i-1);
                    row.add(previous.get(j)+previous.get(j-1));
                }
            }
            list.add(row);
        }
        return list;
    }
}