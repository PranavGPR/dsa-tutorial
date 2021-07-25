package LinkedList;

public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    private boolean isEmpty() {
        return first == null;
    }

    public void addLast(int data) {
        var newNode = new Node(data);

        if (isEmpty())
            first = last = newNode;
        else {
            last.next = newNode;
            last = newNode;
        }
    }

    public void addFirst(int data) {
        var newNode = new Node(data);

        if (isEmpty()) {
            first = last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

    public int indexOf(int data) {
        int index = 0;
        var ptr = first;

        while (ptr != null) {
            if (ptr.value == data)
                return index;
            index++;
            ptr = ptr.next;
        }

        return -1;
    }

    public void print() {
        var ptr = first;

        while (ptr != null) {
            System.out.println(ptr.value);
            ptr = ptr.next;
        }
    }
}
