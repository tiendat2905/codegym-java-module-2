public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator("thread 1");
        NumberGenerator numberGenerator2 = new NumberGenerator("thread 2");
        Thread thread1 = new Thread(numberGenerator1);
        Thread thread2 = new Thread(numberGenerator2);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();

    }
}
