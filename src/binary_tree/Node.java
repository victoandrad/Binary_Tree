package binary_tree;

public class Node<T> {

    // ===========================
    // VARIABLES
    // ===========================

    private T value;
    private Node<T> left;
    private Node<T> right;

    // ===========================
    // CONSTRUCTORS
    // ===========================

    public Node() {
    }

    public Node(T value) {
        this.value = value;
    }

    // ===========================
    // GETTERS & SETTERS
    // ===========================

    public T getValue() {
        return value;
    }

    public T setValue(T value) {
        return this.value = value;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }
}
