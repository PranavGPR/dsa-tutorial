package Queue;

import java.util.Arrays;

public class ArrayQueue {

    private int[] queue;

    public ArrayQueue(int size) {
        queue = new int[size];
    }

    private int front;
    private int rear;
    private int count;

    public void enqueue(int item) {
        if (count == queue.length) {
            throw new IllegalStateException();
        }

        queue[rear] = item;
        rear = (rear + 1) % queue.length;
        count++;

    }

    public int dequeue() {
        var item = queue[front];
        queue[front] = 0;
        front = (front + 1) % queue.length;
        count--;
        return item;
    }

    public int peek() {
        return queue[front];
    }

    public boolean isEmpty() {
        if (front < 0 && rear < 0) {
            return true;
        }
        return false;
    }

    public boolean isFull() {
        if (rear == queue.length) {
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return Arrays.toString(queue);
    }
}
