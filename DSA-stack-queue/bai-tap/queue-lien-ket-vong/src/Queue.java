public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;

    private static class Node<E> {
        private E data;
        private Node<E> link;

        public Node(E data) {
            this.data = data;
        }

        public E getData() {
            return this.data;
        }
    }

    public void enQueue(T value) {
        Node<T> temp = new Node<>(value);

        if (front == null) {
            front = rear = temp;
        } else {
            rear.link = temp;
            rear = temp;
        }
        rear.link = front;
    }

    public T deQueue() {
        if (front == null) {
            throw new RuntimeException("Queue trong");
        }
        Node<T> temp = front;
        if (front == rear) {
            front = rear = null;
        } else {
            front = front.link;
        }
        rear.link = front;
        return temp.data;
    }

    public void displayQueue() {
        Node temp = front;
        String result = "[";
        while (temp != rear) {
            result += temp.data + ",";
            temp = temp.link;
        }
        System.out.println(result + rear.data + "]");
    }

}