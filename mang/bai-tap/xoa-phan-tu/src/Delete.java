import java.util.Arrays;
import java.util.Scanner;

public class Delete {
    public static void main(String[] args) {
        int size;
        int[] array;

        Scanner input = new Scanner(System.in);
        System.out.println("nhap size: ");
        size = input.nextInt();

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap thanh phan " + (i + 1) + " : ");
            array[i] = input.nextInt();
        }
        System.out.println("in thanh phan: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("");
        System.out.println("So can xoa: ");
        int x = input.nextInt();

        removeAll(array, x);
        System.out.print(Arrays.toString(array));

    }

    public static int[] removeAll(int[] array, int x) {
        for (int i = 0; i < array.length; i++){
            while (array[i] == x){
                for (int j = i; j < array.length-1; j++){
                    array[j] = array[j + 1];
                }
                array[array.length - 1] = 0;
            }
        }
        return array;
    }
}
