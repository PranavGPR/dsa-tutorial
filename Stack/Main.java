package Stack;

// import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        String str = "abcdef";
        // Stack<Character> stack = new Stack<>();
        // String revStr = "";

        // for (int i = 0; i < str.length(); i++) {
        // stack.push(str.charAt(i));
        // }

        // for (int i = 0; i < str.length(); i++) {
        // revStr += stack.pop();
        // }
        // System.out.println(revStr);

        StringReverser rev = new StringReverser();
        var result = rev.reverse(str);

        System.out.println(result);
    }
}