package redblack_tree;

public class Node {

    // ===========================
    // VARIABLES
    // ===========================

    private int data;
    private String color;
    private Node left, right;

    // ===========================
    // CONSTRUCTORS
    // ===========================

    public Node() {
    }

    public Node(int data, String color) {
        this.data = data;
        this.color = color;
    }

    // ===========================
    // GETTERS
    // ===========================

    public int getData() {
        return data;
    }

    public String getColor() {
        return color;
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

    public void setData(int data) {
        this.data = data;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
