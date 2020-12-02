import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số USD:");

        usd = scanner.nextDouble();

        double change = usd * 23000;
        System.out.print("VND: " + change);
    }
}
