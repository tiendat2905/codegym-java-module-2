public class Main {
    public static void main(String[] args) {
        LazyPrimeFactorization lazy = new LazyPrimeFactorization();
        OptimizedPrimeFactorization opti = new OptimizedPrimeFactorization();
        Thread thread1 = new Thread(lazy);
        Thread thread2 = new Thread(opti);
        thread1.start();
        thread2.start();
    }
}
