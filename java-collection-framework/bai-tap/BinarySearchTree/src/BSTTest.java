public class BSTTest {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.insert(1);
        tree.insert(345);
        tree.insert(1121);
        tree.insert(1534);
        tree.insert(533);

        tree.postorder();

    }
}
