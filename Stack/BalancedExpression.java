package Stack;

import java.util.Stack;

public class BalancedExpression {

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            }

            if (ch == ')') {
                if (stack.empty())
                    return false;
                stack.pop();
            }
        }

        return stack.empty();
    }
}
