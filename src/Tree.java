import java.util.*;

public class Tree<T> {

    // ===========================
    // VARIABLES
    // ===========================

    private Node<T> root;

    // ===========================
    // CONSTRUCTORS
    // ===========================

    public Tree() {
    }

    public Tree(Node<T> root) {
        this.root = root;
    }

    // ===========================
    // METHODS
    // ===========================

    public static Tree<Integer> getExampleTree() {
        Node<Integer> root = new Node<>(6);

        // Level 1
        root.setLeft(new Node<>(4));
        root.setRight(new Node<>(7));

        // Level 2
        root.getLeft().setLeft(new Node<>(2));
        root.getLeft().setRight(new Node<>(5));
        root.getRight().setRight(new Node<>(9));

        // Level 3
        root.getRight().getRight().setRight(new Node<>(11));

        return new Tree<>(root);
    }

    public int size() {
        return this.preOrderSearch().size();
    }

    public List<Node<T>> preOrderSearch() {

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

    public List<Node<T>> levelSearch() {

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

    public void printPreOrderSearch() {
        List<Node<T>> values = this.preOrderSearch();
        System.out.print("Pre-order Search: [");
        for (int i = 0; i < values.size(); i++) {
            System.out.print(values.get(i).getValue() + (i < values.size() - 1 ? ", " : ""));
        }
        System.out.print("]\n");
    }

    public void printLevelSearch() {
        List<Node<T>> values = this.levelSearch();
        System.out.print("Level Search: [");
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
