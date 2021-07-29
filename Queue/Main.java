package Queue;

import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.enqueue(3);
        queue.enqueue(2);
        queue.enqueue(1);
        queue.enqueue(5);
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
