package avl_tree;

public class Tree {

    // ===========================
    // VARIABLES
    // ===========================

    private Node root;

    // ===========================
    // CONSTRUCTORS
    // ===========================

    public Tree(Node root) {
        this.root = root;
    }

    // ===========================
    // METHODS
    // ===========================

    private int height(Node node) {
        return node == null ? 0 : node.getHeight();
    }

    private void updateHeight(Node node) {
        int leftHeight = height(node.getLeft());
        int rightHeight = height(node.getRight());
        node.setHeight(Math.max(leftHeight, rightHeight) + 1);
    }

    private int getBalance(Node node) {
        return node == null ? 0 : height(node.getLeft()) - height(node.getRight());
    }

    private Node rotateRight(Node y) {
        Node x = y.getLeft();
        Node T2 = x.getRight();

        x.setRight(y);
        y.setLeft(T2);

        updateHeight(y);
        updateHeight(x);

        return x;
    }

    private Node rotateLeft(Node x) {
        Node y = x.getRight();
        Node T2 = y.getLeft();

        y.setLeft(x);
        x.setRight(T2);

        updateHeight(x);
        updateHeight(y);

        return y;
    }

    // ===========================
    // GETTERS & SETTERS
    // ===========================

    public Node getRoot() {
        return root;
    }
}
