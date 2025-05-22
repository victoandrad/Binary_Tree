import binary_tree.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> binaryTree = BinaryTree.getExampleTree();
        binaryTree.printPreOrderSearch();
        binaryTree.printLevelSearch();
    }
}