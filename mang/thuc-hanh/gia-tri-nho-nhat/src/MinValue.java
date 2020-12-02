import java.util.Scanner;

public class MinValue {
    public static void main(String[] args) {
        int size;
        int[] array;

        Scanner input = new Scanner(System.in);
        System.out.println("nhap size: ");
        size = input.nextInt();

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("nhap thanh phan " + (i + 1) + " : ");
            array[i] = input.nextInt();
        }

        System.out.println("in thanh phan: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }

        int min = myMin(array);
        System.out.println("Min la: " + min);
    }

    public static int myMin(int myArray[]) {
        int min = myArray[0];
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
        }
        return min;
    }
}
