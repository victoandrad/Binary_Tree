package avl_tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class AVLTree {

    // ===========================
    // VARIABLES
    // ===========================

    private Node root;

    // ===========================
    // CONSTRUCTORS
    // ===========================

    public AVLTree() {
    }

    // ===========================
    // METHODS
    // ===========================

    public static AVLTree getExampleTree() {
        AVLTree avlTree = new AVLTree();
        for (int i = 0; i < 10; i++) {
            avlTree.insert(i);
        }
        return avlTree;
    }

    private void printValues(List<Node> values) {
        System.out.print("[");
        for (int i = 0; i < values.size(); i++) {
            System.out.print(values.get(i).getKey() + (i < values.size() - 1 ? ", " : ""));
        }
        System.out.print("]\n");
    }

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

    public void insert(int key){
        this.root = insert(this.root, key);
    }

    private Node insert(Node node, int key) {
        if (node == null) {
            return new Node(key);
        }

        if (key < node.getKey()) {
            node.setLeft(insert(node.getLeft(), key));
        } else if (key > node.getKey()) {
            node.setRight(insert(node.getRight(), key));
        } else {
            return node;
        }

        node.setHeight(Math.max(height(node.getLeft()), height(node.getRight())) + 1);

        int balance =  getBalance(node);
        if (balance > 1 && key < node.getLeft().getKey()) {
            return rotateRight(node);
        } else if (balance < -1 && key > node.getRight().getKey()) {
            return rotateLeft(node);
        } else if (balance > 1 && key > node.getLeft().getKey()) {
            node.setLeft(rotateLeft(node.getLeft()));
            return rotateRight(node);
        } else if (balance < -1 && key < node.getRight().getKey()) {
            node.setRight(rotateRight(node.getRight()));
            return rotateLeft(node);
        }

        return node;
    }

    public void preOrder(Node node) {
        List<Node> values = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(node);

        while (!stack.isEmpty()) {
            Node current = stack.pop();
            values.add(current);

            if (current.getRight() != null) {
                stack.push(current.getRight());
            }
            if (current.getLeft() != null) {
                stack.push(current.getLeft());
            }
        }
        printValues(values);
    }

    // ===========================
    // GETTERS
    // ===========================

    public Node getRoot() {
        return root;
    }
}
