class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> freq = new HashMap<>();
        for(int i = 0;i < s.length();i++)
        {   
            char ch = s.charAt(i);
            if(!freq.containsKey(ch))
            {
                freq.put(ch,0);
            }
            freq.put(ch,freq.get(ch) + 1);
        }
        PriorityQueue<Character> q = new PriorityQueue<>((a,b)->(freq.get(b) - freq.get(a)));
        for(char c:freq.keySet())
        {
            q.add(c);
        }
        StringBuilder sb = new StringBuilder();
        while(q.size() > 0)
        {
            char o = q.poll();
            for(int i = 0;i < freq.get(o);i++)
            {
                sb.append(o);
            }
        }
        return sb.toString();
    }
}