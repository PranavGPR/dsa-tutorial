package Queue;

import java.util.Stack;

public class TwoStackQueue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int item) {
        stack1.push(item);
        System.out.println(stack1);
    }

    public int dequeue() {
        while (!stack1.empty()) {
            stack2.push(stack1.pop());
        }

        var item = stack2.pop();

        while (!stack2.empty()) {
            stack1.push(stack2.pop());
        }

        System.out.println(stack1);
        return item;
    }
}
