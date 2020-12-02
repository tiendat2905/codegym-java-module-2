import java.util.Scanner;

public class SumDiagonalLine {
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
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("Tổng là: " + sum(array,a,b));
    }

    public static int sum(int[][] array, int a, int b){
        int sum = 0;
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                if (i == j){
                    sum = sum + array[i][j];
                }
            }
        }
        return sum;
    }
}

