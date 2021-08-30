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

        root.height = height(root);

        balance(root);

        return root;
    }

    private boolean isLeftHeavy(AVLNode node) {
        return balanceFactor(node) > 1;
    }

    private boolean isRightHeavy(AVLNode node) {
        return balanceFactor(node) < -1;
    }

    private int balanceFactor(AVLNode node) {
        return (node == null) ? 0 : height(node.leftChild) - height(node.rightChild);
    }

    public int height() {
        return height(root);
    }

    private int height(AVLNode root) {
        if (root == null)
            return -1;

        if (isLeaf(root))
            return 0;

        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    private boolean isLeaf(AVLNode node) {
        return node.leftChild == null && node.rightChild == null;
    }

    private void balance(AVLNode root) {
        if (isRightHeavy(root)) {
            if (balanceFactor(root.leftChild) < 0)
                System.out.println("Left Rotate " + root.leftChild.value);
            System.out.println("Right Rotate " + root.value);
        } else if (isLeftHeavy(root)) {
            if (balanceFactor(root.rightChild) > 0)
                System.out.println("Right Rotate " + root.rightChild.value);
            System.out.println("Left Rotate " + root.value);
        }
    }

    private AVLNode rotateRight(AVLNode root) {
        var newRoot = root.leftChild;

        root.leftChild = newRoot.rightChild;
        newRoot.rightChild = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    private AVLNode rotateLeft(AVLNode root) {
        var newRoot = root.rightChild;

        root.rightChild = newRoot.leftChild;
        newRoot.leftChild = root;

        setHeight(root);
        setHeight(newRoot);

        return newRoot;
    }

    private void setHeight(AVLNode node) {
        node.height = Math.max(height(node.leftChild), height(node.rightChild)) + 1;
    }
}
