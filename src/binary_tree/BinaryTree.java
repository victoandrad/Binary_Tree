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

    public int countNodes(Node<T> node) {
        if (node == null) return 0;
        return 1 + countNodes(node.getLeft()) + countNodes(node.getRight());
    }

    private void printValues(List<Node<T>> values) {
        System.out.print("[");
        for (int i = 0; i < values.size(); i++) {
            System.out.print(values.get(i).getValue() + (i < values.size() - 1 ? ", " : ""));
        }
        System.out.print("]\n");
    }

    // RECURSIVE

    public void recursivePreOrder(Node<T> node) {
        if (node != null) {
            System.out.println(node.getValue() + " ");
            recursivePreOrder(node.getLeft());
            recursivePreOrder(node.getRight());
        }
    }

    public void recursiveInOrder(Node<T> node) {
        if (node != null) {
            recursiveInOrder(node.getLeft());
            System.out.println(node.getValue() + " ");
            recursiveInOrder(node.getRight());
        }
    }

    public void recursivePostOrder(Node<T> node) {
        if (node != null) {
            recursivePostOrder(node.getLeft());
            recursivePostOrder(node.getRight());
            System.out.println(node.getValue() + " ");
        }
    }

    public void recursiveLevelOrder(Node<T> node) {
        if (node == null) return;

        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node<T> current = queue.poll();
            System.out.println(current.getValue() + " ");

            if (current.getLeft() != null) queue.add(current.getLeft());
            if (current.getRight() != null) queue.add(current.getRight());
        }
    }

    // NON-RECURSIVE

    public void nonRecursivePreOrder(Node<T> node) {
        List<Node<T>> values = new ArrayList<>();
        Stack<Node<T>> stack = new Stack<>();
        stack.push(node);

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
        printValues(values);
    }

    public void nonRecursiveInOrder(Node<T> node) {
        List<Node<T>> values = new ArrayList<>();
        Stack<Node<T>> stack = new Stack<>();
        Node<T> current = node;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }
            current = stack.pop();
            values.add(current);
            current = current.getRight();
        }
        printValues(values);
    }

    public void nonRecursivePostOrder(Node<T> node) {
        List<Node<T>> values = new ArrayList<>();
        Stack<Node<T>> stack = new Stack<>();
        Node<T> current = node;
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
        printValues(values);
    }

    public void nonRecursiveLevelOrder(Node<T> node) {
        List<Node<T>> values = new ArrayList<>();
        Queue<Node<T>> queue = new LinkedList<>();
        queue.add(node);

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
        printValues(values);
    }

    // ===========================
    // GETTERS & SETTERS
    // ===========================

    public Node<T> getRoot() {
        return root;
    }
}
