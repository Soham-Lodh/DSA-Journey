import java.util.*;

class Solution {

    public int calculate(String s) {

        Stack<Character> opStack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == ' ') continue;

            if (Character.isDigit(ch)) {
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    sb.append(s.charAt(i++));
                }
                sb.append(' ');
                i--;
            }

            else if (ch == '(') {
                opStack.push(ch);
            }

            else if (ch == ')') {
                while (!opStack.isEmpty() && opStack.peek() != '(') {
                    sb.append(opStack.pop()).append(' ');
                }
                if (!opStack.isEmpty()) opStack.pop();
            }

            else if (isOperator(ch)) {

                if (ch == '-') {
                    int j = i - 1;
                    while (j >= 0 && s.charAt(j) == ' ') j--;
                    if (j < 0 || s.charAt(j) == '(' || isOperator(s.charAt(j))) {
                        sb.append("0 ");
                    }
                }

                while (!opStack.isEmpty() &&
                        (precedence(opStack.peek()) > precedence(ch) ||
                        (precedence(opStack.peek()) == precedence(ch) && ch != '^'))) {
                    sb.append(opStack.pop()).append(' ');
                }

                opStack.push(ch);
            }
        }

        while (!opStack.isEmpty()) {
            sb.append(opStack.pop()).append(' ');
        }

        String[] postfix = sb.toString().split(" ");
        Stack<Long> valStack = new Stack<>();

        for (String token : postfix) {

            if (token.length() == 0) continue;

            if (Character.isDigit(token.charAt(0))) {
                valStack.push(Long.parseLong(token));
            } else {

                long a = valStack.pop();
                long b = valStack.pop();
                long result = 0;

                switch (token.charAt(0)) {
                    case '+': result = b + a; break;
                    case '-': result = b - a; break;
                    case '*': result = b * a; break;
                    case '/': result = b / a; break;
                    case '^': result = (long)Math.pow(b, a); break;
                }

                valStack.push(result);
            }
        }

        return valStack.pop().intValue();
    }

    int precedence(char ch) {
        if (ch == '^') return 3;
        if (ch == '*' || ch == '/') return 2;
        if (ch == '+' || ch == '-') return 1;
        return 0;
    }

    boolean isOperator(char ch) {
        return ch == '^' || ch == '*' || ch == '/' || ch == '+' || ch == '-';
    }
}