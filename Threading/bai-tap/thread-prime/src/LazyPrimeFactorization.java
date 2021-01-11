public class LazyPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (isPrime(i)) {
                System.out.println("số nguyên tố LazyPrime: " + i);
            }
        }
    }

    public boolean isPrime(int number) {
        int temp = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0)
                temp++;
        }
        if (temp == 2)
            return true;
        else
            return false;
    }

}

