import java.util.Map;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Demo> queue = new Queue<>();
        queue.enQueue(new Demo("a"));
        queue.enQueue(new Demo("b"));
        queue.enQueue(new Demo("c"));
        queue.enQueue(new Demo("d"));
        queue.enQueue(new Demo("e"));

        queue.displayQueue();
        queue.deQueue();
        queue.displayQueue();

    }
}
