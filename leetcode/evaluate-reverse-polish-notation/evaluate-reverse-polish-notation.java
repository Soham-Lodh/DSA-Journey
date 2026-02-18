class Solution {
    public int evalRPN(String[] tokens) {
        int[] stack = new int[tokens.length];
        int top = -1;
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/")) {
                int b = stack[top--];
                int a = stack[top--];
                switch (token) {
                    case "+": stack[++top] = a + b; break;
                    case "-": stack[++top] = a - b; break;
                    case "*": stack[++top] = a * b; break;
                    case "/": stack[++top] = a / b; break;
                }
            } else {
                stack[++top] = Integer.parseInt(token);
            }
        }
        return stack[top];
    }
}
