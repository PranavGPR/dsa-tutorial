package Queue;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        // reverseOnOwn(queue);
        reverse(queue);
        System.out.println(queue);
    }

    public static void reverseOnOwn(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        if (queue.peek() == null) {
            throw new IllegalStateException();
        }

        while (queue.peek() != null) {
            stack.push(queue.poll());
        }

        while (!stack.empty()) {
            queue.add(stack.pop());
        }

    }

    public static void reverse(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }
}
