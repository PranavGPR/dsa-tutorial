package LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {

    private Node first;
    private Node last;

    private boolean isEmpty() {
        return first == null;
    }

    public void addLast(int data) {
        var newNode = new Node(data, null);

        if (isEmpty())
            first = last = newNode;
        else {
            last.setNext(newNode);
            last = newNode;
        }
    }

    public void addFirst(int data) {
        var newNode = new Node(data, null);

        if (isEmpty()) {
            first = last = newNode;
        } else {
            newNode.setNext(first);
            first = newNode;
        }
    }

    public int indexOf(int data) {
        int index = 0;
        var ptr = first;

        while (ptr != null) {
            if (ptr.getValue() == data)
                return index;
            index++;
            ptr = ptr.getNext();
        }

        return -1;
    }

    public boolean contains(int data) {
        return indexOf(data) != -1;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        }

        var second = first.getNext();
        first.setNext(null);
        first = second;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
            return;
        }

        var previous = getPrevious(last);
        last = previous;
        last.setNext(null);
    }

    private Node getPrevious(Node node) {
        var ptr = first;
        while (ptr != null) {
            if (ptr.getNext() == node)
                return ptr;
            ptr = ptr.getNext();
        }
        return null;
    }

    public void print() {
        var ptr = first;

        while (ptr != null) {
            System.out.println(ptr.getValue());
            ptr = ptr.getNext();
        }
    }
}
