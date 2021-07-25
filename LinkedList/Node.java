package LinkedList;

public class Node {
    private int value;
    private Node next;

    Node(int item, Node nextLink) {
        value = item;
        next = nextLink;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setValue(int val) {
        value = val;
    }

    public void setNext(Node nxt) {
        next = nxt;
    }

}