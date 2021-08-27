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

        if (isRightHeavy(root))
            System.out.println(root.value + " is Right heavy");
        if (isLeftHeavy(root))
            System.out.println(root.value + " is Left heavy");

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
}
