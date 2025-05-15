public class Main {
    public static void main(String[] args) {

        Tree<Integer> tree = Tree.getExampleTree();
        tree.printDepthSearch();
        tree.printBreadthSearch();
    }
}