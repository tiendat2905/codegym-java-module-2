import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int currentElement = list[i];
            int k;
//            System.out.print(list[i] + "\t");
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                System.out.print("\n" + "doi " + list[k] + " voi " + list[k + 1]);
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
            System.out.println("\n" + "lan " + i + ":");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {5, 3, 1, 7, 13, 7, 8, 9};
        insertionSort(list);
        System.out.println("\n" + "list cua ban");
        System.out.println(Arrays.toString(list));
    }
}
