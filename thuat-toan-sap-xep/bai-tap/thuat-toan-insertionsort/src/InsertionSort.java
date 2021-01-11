import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap size: ");
        int size = scanner.nextInt();
        int[] list = new int[size];
        for (int i =0; i < list.length; i++){
            System.out.println("nhap thanh phan");
            list[i] = scanner.nextInt();
        }
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i] + "\t");
        }
        insertionSort(list);
        System.out.println("\n" + Arrays.toString(list));
    }
}
