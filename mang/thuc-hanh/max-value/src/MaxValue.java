import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Nhập size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("Kích thước không được vượt quá 20");
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Nhập thành phần " + (i + 1) + " : ");
            array[i] = scanner.nextInt();
        }
        System.out.print("In mảng: ");

        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = myMax(array);
        System.out.println("Max là: " + max);

    }

    public static int myMax(int myArray[]) {
        int max = myArray[0];
        for (int j = 0; j < myArray.length; j++) {
            if (myArray[j] > max) {
                max = myArray[j];
            }
        }
        return max;
    }
}
