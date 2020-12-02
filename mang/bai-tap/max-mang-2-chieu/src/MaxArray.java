import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        int a,b;
        Scanner input = new Scanner(System.in);

        System.out.println("nhap so dong: ");
        a = input.nextInt();
        System.out.println("nhap so cot: ");
        b = input.nextInt();

        int[][] array = new int[a][b];


        System.out.println("nhap phan tu");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                System.out.print("array[" + i + "]["+ j + "]");
                array[i][j] = input.nextInt();
            }
        }

        int max = array[0][0];
        int x = 0;
        int y = 0;

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println("Max: " + max + " vi trí: " + x + " " + y);
    }
}

