import java.util.Scanner;

public class SumColumn {
    public static void main(String[] args) {
        int a,b;
        int sum;
        Scanner input = new Scanner(System.in);

        System.out.println("nhap so dong: ");
        a = input.nextInt();
        System.out.println("nhap so cot: ");
        b = input.nextInt();

        int[][] array = new int[a][b];

        System.out.println("nhap thanh phan");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                System.out.println("array["+ i + "]["+ j + "]");
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("column");
        int x = input.nextInt();

        System.out.println(sum(array,x));
    }

    public static int sum(int[][] array,int index){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
                sum = sum + array[i][index];
        }
        return sum;
    }
}
