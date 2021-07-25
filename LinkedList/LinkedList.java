package LinkedList;

import java.util.NoSuchElementException;

public class LinkedList {

    private Node first;
    private Node last;
    private int size;

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
        size++;
    }

    public void addFirst(int data) {
        var newNode = new Node(data, null);

        if (isEmpty()) {
            first = last = newNode;
        } else {
            newNode.setNext(first);
            first = newNode;
        }
        size++;
    }

    public void removeFirst() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first == last) {
            first = last = null;
        } else {
            var second = first.getNext();
            first.setNext(null);
            first = second;
        }

        size--;
    }

    public void removeLast() {

        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
        } else {
            var previous = getPrevious(last);
            last = previous;
            last.setNext(null);
        }

        size--;
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

    private Node getPrevious(Node node) {
        var ptr = first;
        while (ptr != null) {
            if (ptr.getNext() == node)
                return ptr;
            ptr = ptr.getNext();
        }
        return null;
    }

    public int size() {
        return size;
    }

    public int[] toArray() {
        int[] array = new int[size];
        var ptr = first;
        var index = 0;
        while (ptr != null) {
            array[index++] = ptr.getValue();
            ptr = ptr.getNext();
        }

        return array;
    }

    public void print() {
        var ptr = first;

        while (ptr != null) {
            System.out.println(ptr.getValue());
            ptr = ptr.getNext();
        }
    }
}
