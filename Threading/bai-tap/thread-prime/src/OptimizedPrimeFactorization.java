public class OptimizedPrimeFactorization implements Runnable {
    @Override
    public void run() {
        for (int i =2; i< 100; i++){
            if (isPrime(i)){
                System.out.println("số nguyên tố Optimized: " + i);
            }
        }
    }

    public boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        int i = 2;
        while (i <= Math.sqrt(number)){
            if (number % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
