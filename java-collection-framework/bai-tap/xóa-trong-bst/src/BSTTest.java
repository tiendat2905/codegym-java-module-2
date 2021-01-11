public class BSTTest {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.insert(5);
        tree.insert(100);
        tree.insert(80);
        tree.insert(65);
        tree.insert(85);
        tree.insert(70);


        tree.delete(85);
        tree.inorder();
        tree.delete(70);
        tree.inorder();
    }

}
