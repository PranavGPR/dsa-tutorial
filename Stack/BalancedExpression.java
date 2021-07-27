package Stack;

import java.util.Stack;

public class BalancedExpression {

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch)) {
                stack.push(ch);
            }

            if (isRightBracket(ch)) {
                if (stack.empty())
                    return false;
                var top = stack.pop();
                if (bracketsMatch(top, ch))
                    return false;
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(char ch) {
        return ch == '(' || ch == '<' || ch == '[' || ch == '{';
    }

    private boolean isRightBracket(char ch) {
        return ch == ')' || ch == '>' || ch == ']' || ch == '}';
    }

    private boolean bracketsMatch(char left, char right) {
        return (right == ')' && left != '(') || (right == '>' && left != '<') || (right == ']' && left != '[')
                || (right == '}' && left != '{');
    }
}
