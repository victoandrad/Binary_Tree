package binary_tree;

public class Node<T> {

    // ===========================
    // VARIABLES
    // ===========================

    private T value;
    private Node<T> left, right;

    // ===========================
    // CONSTRUCTORS
    // ===========================

    public Node() {
    }

    public Node(T value) {
        this.value = value;
    }

    // ===========================
    // GETTERS
    // ===========================

    public T getValue() {
        return value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public Node<T> getRight() {
        return right;
    }

    // ===========================
    // SETTERS
    // ===========================

    public T setValue(T value) {
        return this.value = value;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
}
