import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        int[] array;
        int size;

        Scanner input = new Scanner(System.in);
        System.out.println("nhap size: ");
        size = input.nextInt();

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("nhap thanh phan" + (i + 1) + " : ");
            array[i] = input.nextInt();
        }

        System.out.println("in thanh phan: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }

        System.out.println("");
        System.out.println("vi tri them: ");
        int vt = input.nextInt();

        System.out.println("");
        System.out.println("so muon them: ");
        int gt = input.nextInt();

        add(array, vt, gt);
        System.out.print(Arrays.toString(array));
    }

    public static int[] add(int[] array, int vt, int gt) {
        int a = array[vt];
        int b;
        array[vt] = gt;
        for (int i = vt + 1; i < array.length; i++) {
            b = array[i];
            array[i] = a;
            a = b;
        }
        return array;
    }
}
