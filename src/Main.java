import binary_tree.BinaryTree;

public class Main {
    public static void main(String[] args) {

        BinaryTree<String> binaryTree = BinaryTree.getExampleTree();

        System.out.print("Pre-Order: ");
        binaryTree.printValues(binaryTree.nonRecursivePreOrderSearch());

        System.out.print("In-Order: ");
        binaryTree.printValues(binaryTree.nonRecursiveInOrderSearch());

        System.out.print("Post-Order:");
        binaryTree.printValues(binaryTree.nonRecursiveInPostOrderSearch());

        System.out.print("Level-Order:");
        binaryTree.printValues(binaryTree.nonRecursiveLevelSearch());

    }
}