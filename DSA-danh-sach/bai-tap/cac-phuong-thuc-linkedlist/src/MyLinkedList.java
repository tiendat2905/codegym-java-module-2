import org.w3c.dom.Node;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
    }

    public class Node<T> {
        private Node next;
        private T data;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return this.data;
        }
    }

    public int size(){
        return numNodes;
    }
    public void add(int index, E element) {
        if (head == null) {
            addFirst(element);
            return;
        }

        Node<E> temp = head;
        Node<E> holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E e) {
        head = new Node<>(e);
        head.next = null;
        numNodes++;
    }

    public void addLast(E e) {
        add(numNodes, e);
    }

    public E remove(int index) {
        Node<E> temp = head;
        if (index == 0){
            head = temp.next;
            return temp.getData();
        }else {
            for (int i = 0; i < index -1; i++){
                temp = temp.next;
            }
            Node<E> holder = temp.next;
            temp.next = temp.next.next;
            numNodes--;
            return holder.getData();
        }
    }

    public boolean remove(Object e){
        int index = indexOf((E) e);
        if (index == -1){
            return false;
        }
        remove(index);
        return true;
    }

    public int indexOf(E o){
        Node<E> temp = head;
        int index = 0;
        while (temp != null){
            if (o.equals(temp.getData()))
                return index;
            temp = temp.next;
            index ++;
        }
        return -1;
    }

    public E get(int i){
        Node<E> temp = head;
        for (int j = 0; j < i; j++){
            temp = temp.next;
        }
        return  (temp == null) ? null : temp.getData();
    }

    public MyLinkedList<E> clone(){
        return this;
    }

    public boolean contain(E o){
        Node<E> temp = head;
        while (temp != null){
            if (o.equals(temp.getData()))
                return true;
            temp = temp.next;

        }
        return false;
    }

    public void clear(){
        head = null;
        numNodes = 0;
    }

    public void printList(){
        Node<E> temp = head;
        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
