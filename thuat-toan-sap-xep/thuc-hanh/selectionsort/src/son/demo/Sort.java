package son.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static int random() {
        return (int) Math.round(Math.random() * 1000);
    }

    public static int[] initArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random();
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            int indexMin = i;
            for (int j = i+1; j<arr.length; j++){
                if (arr[indexMin] > arr[j]){
                    indexMin = j;
                }
            }
            if (indexMin != i){
                int temp = arr[indexMin];
                arr[indexMin] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }

//    public static int[] bubbleSort(int[] arr){
//
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = scanner.nextInt();
        scanner.nextLine();
//        System.out.println(Arrays.toString(initArray(size)));
        int[] arr = initArray(size);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(selectionSort(arr)));
//        System.out.println(Arrays.toString(arr));q
    }

}
