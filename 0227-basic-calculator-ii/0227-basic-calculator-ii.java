class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0) return 0;

        Stack<Integer> stack = new Stack<>();
        int currentNumber = 0;
        char operation = '+';
        int len = s.length();

        for (int i = 0; i < len; i++) {
            char currentChar = s.charAt(i);

            if (Character.isDigit(currentChar)) {
                currentNumber = (currentNumber * 10) + (currentChar - '0');
            }

            // If it's an operator or end of string
            if ((!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar)) || i == len - 1) {
                if (operation == '+') {
                    stack.push(currentNumber);
                } else if (operation == '-') {
                    stack.push(-currentNumber);
                } else if (operation == '*') {
                    int stackTop = stack.pop();
                    stack.push(stackTop * currentNumber);
                } else if (operation == '/') {
                    int stackTop = stack.pop();
                    stack.push(stackTop / currentNumber);
                }

                operation = currentChar;  // update the operator
                currentNumber = 0;        // reset for next number
            }
        }

        // Sum all values from stack
        int result = 0;
        for (int num : stack) {
            result += num;
        }
        return result;
    }
}