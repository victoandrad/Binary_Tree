import binary_tree.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree<String> binaryTree = BinaryTree.getExampleTree();
        binaryTree.printPreOrderSearch();
        binaryTree.printInOrderSearch();
        binaryTree.printPostOrderSearch();
        binaryTree.printLevelSearch();
    }
}