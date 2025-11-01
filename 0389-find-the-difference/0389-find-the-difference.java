class Solution {
    public char findTheDifference(String s, String t) {
        int counts = 0;
        int countt = 0;
        for(int i = 0;i < s.length();i++)
        {
            counts += s.charAt(i);
        }
        for(int i = 0;i < t.length();i++)
        {
            countt += t.charAt(i);
        }
        return (char)(countt - counts);
    }
}