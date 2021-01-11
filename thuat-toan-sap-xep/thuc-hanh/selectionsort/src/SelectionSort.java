import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            if (currentMinIndex != i) {
                System.out.println("doi phan tu " + list[i] + " voi " + list[currentMinIndex]);
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
            System.out.println("vong lap thu " + (i + 1));
            System.out.println(Arrays.toString(list));
        }
    }

    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        System.out.println("Mang du lieu dau vao: ");
        System.out.println(Arrays.toString(list));
        selectionSort(list);
        System.out.println("Mang du lieu sau sap xep: ");
        System.out.println(Arrays.toString(list));
    }
}
