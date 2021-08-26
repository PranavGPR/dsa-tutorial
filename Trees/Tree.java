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

    public void traversePostOrder() {
        traversePostOrder(root);
    }

    private void traversePostOrder(Node root) {
        if (root == null)
            return;

        traversePostOrder(root.rightChild);
        System.out.println(root.value);
        traversePostOrder(root.leftChild);
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null)
            return -1;

        if (isLeaf(root))
            return 0;

        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    private boolean isLeaf(Node node) {
        return node.leftChild == null && node.rightChild == null;
    }

    public int min() {
        return min(root);
    }

    private int min(Node root) {
        if (isLeaf(root))
            return root.value;

        var left = min(root.leftChild);
        var right = min(root.rightChild);

        return Math.min(Math.min(left, right), root.value);
    }
}
