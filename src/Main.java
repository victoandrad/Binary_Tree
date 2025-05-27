import binary_tree.BinaryTree;

public class Main {
    public static void main(String[] args) {

        BinaryTree<String> binaryTree = BinaryTree.getExampleTree();
        System.out.println("Count nodes: " + binaryTree.countNodes(binaryTree.getRoot()));

        System.out.print("\n---------- Recursive Methods ----------\n");

        System.out.print("Pre-Order:    ");
        binaryTree.recursivePreOrder(binaryTree.getRoot());

        System.out.print("In-Order:     ");
        binaryTree.recursiveInOrder(binaryTree.getRoot());

        System.out.print("Post-Order:   ");
        binaryTree.recursivePostOrder(binaryTree.getRoot());

        System.out.print("Level-Order:  ");
        binaryTree.recursiveLevelOrder(binaryTree.getRoot());

        System.out.println("---------- Non-recursive Methods ----------");
        System.out.print("Pre-Order:    ");
        binaryTree.nonRecursivePreOrder(binaryTree.getRoot());

        System.out.print("In-Order:     ");
        binaryTree.nonRecursiveInOrder(binaryTree.getRoot());

        System.out.print("Post-Order:   ");
        binaryTree.nonRecursivePostOrder(binaryTree.getRoot());

        System.out.print("Level-Order:  ");
        binaryTree.nonRecursiveLevelOrder(binaryTree.getRoot());
    }
}