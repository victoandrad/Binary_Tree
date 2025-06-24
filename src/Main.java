import avl_tree.AVLTree;
import binary_tree.BinaryTree;
import binary_tree.Node;

public class Main {
    public static void main(String[] args) {

        BinaryTree<String> binaryTree = BinaryTree.getExampleTree();
        Node<String> root = binaryTree.getRoot();

        System.out.println("========== Recursive ==========");

        System.out.println("Count nodes: " + binaryTree.recursiveCountNodes(root));
        System.out.println("Count leaf nodes: " + binaryTree.recursiveCountLeafNodes(root));

        System.out.println("Pre-Order:    ");
        binaryTree.recursivePreOrder(root);

        System.out.println("In-Order:     ");
        binaryTree.recursiveInOrder(root);

        System.out.println("Post-Order:   ");
        binaryTree.recursivePostOrder(root);

        System.out.println("Level-Order:  ");
        binaryTree.recursiveLevelOrder(root);

        System.out.println("========== Non-recursive ==========");

        System.out.println("Count nodes: " + binaryTree.nonRecursiveCountNodes(root));
        System.out.println("Count leaf nodes: " + binaryTree.nonRecursiveCountLeafNodes(root));

        System.out.print("Pre-Order:    ");
        binaryTree.nonRecursivePreOrder(root);

        System.out.print("In-Order:     ");
        binaryTree.nonRecursiveInOrder(root);

        System.out.print("Post-Order:   ");
        binaryTree.nonRecursivePostOrder(root);

        System.out.print("Level-Order:  ");
        binaryTree.nonRecursiveLevelOrder(root);

        System.out.println("========== AVL Tree ==========");
        AVLTree avlTree = AVLTree.getExampleTree();
        System.out.print("AVL Tree with Pre-Order: ");
        avlTree.preOrder(avlTree.getRoot());
    }
}