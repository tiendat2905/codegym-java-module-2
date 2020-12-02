import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số Cấn Đọc: ");
        int number = scanner.nextInt();
        int init = number % 10;
        int dozens = number / 10;

        switch (dozens) {
            case 1:
                System.out.print("Ten");
                break;
            case 2:
                System.out.print("twenty");
                break;
            case 3:
                System.out.print("thirty");
                break;
            case 4:
                System.out.print("fourty");
                break;
            case 5:
                System.out.print("fifty");
                break;
            case 6:
                System.out.print("sixty");
                break;
            case 7:
                System.out.print("seventy");
                break;
            case 8:
                System.out.print("Eighty");
                break;
            case 9:
                System.out.print("Ninety");
                break;
        }

        switch (init) {
            case 1:
                System.out.print("one");
                break;
            case 2:
                System.out.print("two");
                break;
            case 3:
                System.out.print("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.print("five");
                break;
            case 6:
                System.out.print("six");
                break;
            case 7:
                System.out.print("seven");
                break;
            case 8:
                System.out.print("Eight");
                break;
            case 9:
                System.out.print("nine");
                break;

        }
    }
}
