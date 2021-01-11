public class QueueClient {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(4);
        myQueue.enQueue(4);
        myQueue.deQueue();
        myQueue.enQueue(56);
        myQueue.enQueue(2);
        myQueue.enQueue(67);
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.enQueue(24);
        myQueue.deQueue();
        myQueue.enQueue(98);
        myQueue.enQueue(45);
        myQueue.enQueue(23);
        myQueue.enQueue(435);
        myQueue.print();

    }
}
