public class BST<E extends Comparable<E>> {
    private Node<E> root;
    private int size = 0;

    public BST() {
    }

    public BST(E[] object) {
        for (E e : object) {
            insert(e);
        }
    }

    public boolean insert(E key) {
        if (root == null) {
            root = createNewNode(key);
        } else {
            Node<E> parent = null;
            Node<E> current = root;
            while (current != null) {
                if (key.compareTo(current.getKey()) < 0) {
                    parent = current;
                    current = current.getLeft();
                } else if (key.compareTo(current.getKey()) > 0) {
                    parent = current;
                    current = current.getRight();
                } else
                    return false;
            }

            if (key.compareTo(parent.getKey()) < 0) {
                parent.setLeft(createNewNode(key));
            } else
                parent.setRight(createNewNode(key));
        }
        size++;
        return true;
    }

    private Node<E> createNewNode(E key) {
        return new Node<>(key);
    }

    public void postorder(Node<E> root) {
        if (root == null) return;
            postorder(root.getLeft());
            postorder(root.getRight());
            System.out.println(root.getKey() + " ");

    }

    public void postorder() {
        postorder(root);
    }

//    public Node<E> search(Node<E> root, int key) {
//        if (root == null || root.key == key) {
//            return root;
//        }
//        if (root.key > key) {
//            return search(root.left, key);
//        }
//        return search(root.right, key);
//    }
}
