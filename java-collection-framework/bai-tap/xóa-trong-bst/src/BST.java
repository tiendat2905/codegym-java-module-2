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

    public boolean insert(E element) {
        if (root == null) {
            root = createNewNode(element);
        } else {
            Node<E> parent = null;
            Node<E> current = root;
            while (current != null) {
                if (element.compareTo(current.getElement()) < 0) {
                    parent = current;
                    current = current.getLeft();
                } else if (element.compareTo(current.getElement()) > 0) {
                    parent = current;
                    current = current.getRight();
                } else
                    return false;
            }
            if (element.compareTo(parent.getElement()) < 0) {
                parent.setLeft(createNewNode(element));
            } else
                parent.setRight(createNewNode(element));
        }
        size++;
        return true;
    }

    private Node<E> createNewNode(E element) {
        return new Node<>(element);
    }

    public void delete(E e) {
        Node<E> parent = null;
        Node<E> current = root;
        while (current != null) {
            int result = e.compareTo(current.getElement());
            if (result == 0) break;
            parent = current;
            if (result < 0) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
        // khong tim thay node
        if (current == null) {
            System.out.println("Khong tim thay");
            return;
        }
        // khong co node trai
        if (current.getLeft() == null) {
            // neu parent: null -> current: root
            if (parent == null) {
                root = current.getRight();
                return;
            }
            if (e.compareTo(parent.getElement()) > 0)
                parent.setRight(current.getRight());
            else
                parent.setLeft(current.getRight());
        }else {
            NodeOnTheLeft(current);
        }
    }

    public void NodeOnTheLeft(Node<E> remove) {
        Node<E> parentNode = remove;
        Node<E> rightMostNode = remove.getLeft();
        // duyet cay phu ben trai -> tim rightMostNode
        while (rightMostNode.getRight() != null) {
           parentNode = rightMostNode;
           rightMostNode = rightMostNode.getRight();
        }
        // the gia tri cua rightMostNode -> node can xoa
        remove.setElement(rightMostNode.getElement());
        // noi cha cua RMN voi con trai cua RMN
        if (parentNode == remove) {
            parentNode.setLeft(rightMostNode.getLeft());
        } else {
            parentNode.setRight(rightMostNode.getLeft());
        }
    }

    public void inorder(){
        inorderRecursion(root);
    }

    protected void inorderRecursion(Node<E> node) {
        if (node == null) return;
        inorderRecursion(node.getLeft());
        System.out.println(node.getElement() + " ");
        inorderRecursion(node.getRight());
    }
}


