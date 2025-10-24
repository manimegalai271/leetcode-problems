class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
         int j = s.length() - 1;
         int i = 0;
         while(i < j)
         {
             if(ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u' || ch[j] == 'A' || ch[j] == 'A' || ch[j] == 'E' || ch[j] == 'I' || ch[j] == 'O' || ch[j] == 'U')
             {
                 if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U')
                 {
                     char temp = ch[i];
                     ch[i] = ch[j];
                     ch[j] = temp;
                     i++;
                     j--;
                 }
                 else 
                 {
                     i++;
                 }
             }
             else 
             {
                 j--;
             }
         }
         return new String(ch);
    }
}