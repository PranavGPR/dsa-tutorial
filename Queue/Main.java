package Queue;

import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
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
