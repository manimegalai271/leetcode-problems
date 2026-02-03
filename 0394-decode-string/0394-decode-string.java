import java.util.Stack;

class Solution {
    public String decodeString(String s) {
        Stack<Object> stack = new Stack<>();
        int curNum = 0;
        String curString = "";

        for (char c : s.toCharArray()) {
            if (c == '[') {
                stack.push(curString);
                stack.push(curNum);
                curString = "";
                curNum = 0;
            } 
            else if (c == ']') {
                int num = (int) stack.pop();
                String prevString = (String) stack.pop();

                StringBuilder temp = new StringBuilder(prevString);
                for (int i = 0; i < num; i++) {
                    temp.append(curString);
                }
                curString = temp.toString();
            } 
            else if (Character.isDigit(c)) {
                curNum = curNum * 10 + (c - '0');
            } 
            else {
                curString += c;
            }
        }
        return curString;
    }
}
