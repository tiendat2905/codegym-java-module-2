import java.util.Scanner;

public class BinarySearchTree {
    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int low = 0;
        int high = arr.length - 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap key:");
        int key = scanner.nextInt();
        System.out.println(binarySearch(arr, low, high, key));
    }

    public static int binarySearch(int[] arr, int low, int high, int key) {

        int mid = (low + high) / 2;
        if (high < low) {
            return -1;
        }
        if (key == arr[mid]) {
            return mid;

        }
        if (key < arr[mid]) {
            high = mid - 1;
        }
        if (key > arr[mid]) {
            low = mid + 1;
        }
        return binarySearch(arr, low, high, key);
    }
}
