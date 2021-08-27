package AVLTree;

public class AVLTree {
    private AVLNode root;

    public void insert(int value) {
        root = insert(root, value);
    }

    private AVLNode insert(AVLNode root, int value) {
        var newNode = new AVLNode(value);

        if (root == null)
            return newNode;

        if (value < root.value)
            root.leftChild = insert(root.leftChild, value);
        else
            root.rightChild = insert(root.rightChild, value);

        return root;
    }
}
