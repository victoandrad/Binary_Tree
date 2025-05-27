package binary_tree;

import java.util.*;

public class BinaryTree<T> {

    // ===========================
    // VARIABLES
    // ===========================

    private Node<T> root;

    // ===========================
    // CONSTRUCTORS
    // ===========================

    public BinaryTree() {
    }

    public BinaryTree(Node<T> root) {
        this.root = root;
    }

    // ===========================
    // METHODS
    // ===========================

    public static BinaryTree<String> getExampleTree() {
        Node<String> root = new Node<>("A");

        // Level 1
        root.setLeft(new Node<>("B"));
        root.setRight(new Node<>("C"));

        // Level 2
        root.getLeft().setLeft(new Node<>("D"));
        root.getLeft().setRight(new Node<>("E"));
        root.getRight().setRight(new Node<>("F"));

        return new BinaryTree<>(root);
    }

    public int size() {
        return this.nonRecursivePreOrderSearch().size();
    }

    public List<Node<T>> nonRecursivePreOrderSearch() {

        List<Node<T>> values = new ArrayList<>();
        Stack<Node<T>> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node<T> current = stack.pop();
            values.add(current);

            if (current.getRight() != null) {
                stack.push(current.getRight());
            }
            if (current.getLeft() != null) {
                stack.push(current.getLeft());
            }
        }

        return values;
    }

    public List<Node<T>> nonRecursiveInOrderSearch() {

        List<Node<T>> values = new ArrayList<>();
        Stack<Node<T>> stack = new Stack<>();
        Node<T> current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }
            current = stack.pop();
            values.add(current);
            current = current.getRight();
        }

        return values;
    }

    public List<Node<T>> nonRecursiveInPostOrderSearch() {

        List<Node<T>> values = new ArrayList<>();
        Stack<Node<T>> stack = new Stack<>();
        Node<T> current = root;
        Node<T> previous = null;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }
            current = stack.peek();
            if (current.getRight() == null || current.getRight() == previous) {
                values.add(current);
                stack.pop();
                previous = current;
                current = null;
            } else {
                current = current.getRight();
            }
        }

        return values;
    }

    public List<Node<T>> nonRecursiveLevelSearch() {

        List<Node<T>> values = new ArrayList<>();
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node<T> current = queue.poll();
            values.add(current);

            if (current.getLeft() != null) {
                queue.add(current.getLeft());
            }
            if (current.getRight() != null) {
                queue.add(current.getRight());
            }
        }

        return values;
    }

    public void printValues(List<Node<T>> values) {
        System.out.print("[");
        for (int i = 0; i < values.size(); i++) {
            System.out.print(values.get(i).getValue() + (i < values.size() - 1 ? ", " : ""));
        }
        System.out.print("]\n");
    }

    // ===========================
    // GETTERS & SETTERS
    // ===========================

    public Node<T> getRoot() {
        return root;
    }
}
