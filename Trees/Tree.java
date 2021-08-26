package Trees;

import java.util.NoSuchElementException;

public class Tree {
    private Node root;

    public void insert(int value) {
        var newNode = new Node(value);

        if (root == null) {
            root = newNode;
            return;
        }

        var current = root;
        while (true) {
            if (value < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public boolean find(int value) {
        var current = root;

        if (root.value == value)
            return true;

        while (true) {
            if (value < current.value) {
                if (current.rightChild != null) {
                    if (current.leftChild.value == value) {
                        return true;
                    }
                    current = current.leftChild;
                } else
                    throw new NoSuchElementException();
            } else {
                if (current.rightChild != null) {
                    if (current.rightChild.value == value) {
                        return true;
                    }
                    current = current.rightChild;
                } else
                    throw new NoSuchElementException();
            }
        }
    }

    public boolean findEasier(int value) {
        var current = root;

        while (current != null) {
            if (value < current.value) {
                current = current.leftChild;
            } else if (value > current.value) {
                current = current.rightChild;
            } else
                return true;
        }

        return false;
    }

    public void traversePreOrder() {
        traversePreOrder(root);
    }

    private void traversePreOrder(Node root) {
        if (root == null)
            return;

        System.out.println(root.value);
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }

    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(Node root) {
        if (root == null)
            return;

        traverseInOrder(root.leftChild);
        System.out.println(root.value);
        traverseInOrder(root.rightChild);
    }

}
