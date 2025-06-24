package redblack_tree;

public class RedBlackTree {

    // ===========================
    // VARIABLES
    // ===========================

    private Node root;

    // ===========================
    // CONSTRUCTORS
    // ===========================

    public RedBlackTree() {
    }

    public RedBlackTree(Node root) {
        this.root = root;
    }

    // ===========================
    // METHODS
    // ===========================

    public void insert(int data) {
        Node node = new Node(data, "red");
        if (root == null) {
            node.setColor("black");
            root = node;
            return;
        }

        Node current = root;
        while (current != null) {
        }

    }

    public void delete(int data) {
    }

    // ===========================
    // GETTERS
    // ===========================

    public Node getRoot() {
        return root;
    }
}
