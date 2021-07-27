package Stack;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input) {

        if(input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray())
            stack.push(ch);

        StringBuffer rev = new StringBuffer();

        while (!stack.empty()) {
            rev.append(stack.pop());
        }

        return rev.toString();
    }
}
