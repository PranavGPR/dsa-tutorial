package Trees;

public class Node {
    int value;
    Node leftChild;
    Node rightChild;

    Node(int item) {
        value = item;
    }

    @Override
    public String toString() {
        return "Node=" + value;
    }

    public int getLeftValue() {
        return leftChild.value;
    }

    public int getRightValue() {
        return rightChild.value;
    }

    public void setLeftValue(int val) {
        leftChild.value = val;
    }

    public void setRightValue(int val) {
        rightChild.value = val;
    }
}
