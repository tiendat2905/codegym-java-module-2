import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số nguyên tố hiển thị:");
        int number = input.nextInt();
        int count = 0;
        int n = 2;

        while (count < number){
            if (isPrime(n)){
                count++;
                System.out.println(n);
            }
            n++;
        }
    }

    public static boolean isPrime(int number){
        if (number < 2){
            return false;
        }
        int i = 2;
        while (i < Math.sqrt(number)){
            if (number % i == 0){
                return  false;
            }
            i++;
        }
        return true;
    }
}
