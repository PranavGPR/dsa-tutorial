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

    public void reverseOnOwn() {
        Node previous = null;
        var current = first;
        Node next = null;

        last = first;
        last.setNext(null);

        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        first = previous;
    }

    public void reverse() {

        if (isEmpty())
            return;

        var previous = first;
        var current = first.getNext();
        while (current != null) {
            var next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }

        last = first;
        last.setNext(null);
        first = previous;
    }

    public int getKthNodeFromEndOnOwn(int k) {
        if (isEmpty()) {
            return -1;
        }

        if (first == last) {
            return first.getValue();
        }

        if (first.getNext() == last) {
            return first.getValue();
        }

        var current = first;
        var next = first;
        for (int i = 0; i < k; i++) {
            next = next.getNext();
        }

        while (next != null) {
            current = current.getNext();
            next = next.getNext();
        }

        return current.getValue();
    }

    public void print() {
        var ptr = first;

        while (ptr != null) {
            System.out.println(ptr.getValue());
            ptr = ptr.getNext();
        }
    }
}
