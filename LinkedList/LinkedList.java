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

    public void addLast(int data) {
        var newNode = new Node(data);

        if (first == null)
            first = last = newNode;
        else {
            last.next = newNode;
            last = newNode;
        }
    }

    public void print() {
        var ptr = first;

        while (ptr.next != null) {
            System.out.println(ptr.value);
            ptr = ptr.next;
        }

        System.out.println(ptr.value);
    }
}
