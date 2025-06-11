package avl_tree;

public class Node {

    // ===========================
    // VARIABLES
    // ===========================

    private int key, height;
    private Node left, right;

    // ===========================
    // CONSTRUCTORS
    // ===========================

    public Node() {
    }

    public Node(int key) {
        this.key = key;
        this.height = 1;
    }

    // ===========================
    // GETTERS
    // ===========================

    public int getKey() {
        return key;
    }

    public int getHeight() {
        return height;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    // ===========================
    // SETTERS
    // ===========================

    public void setKey(int key) {
        this.key = key;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
