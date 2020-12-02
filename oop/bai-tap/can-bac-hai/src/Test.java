import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("nhap a: ");
        double a = input.nextDouble();
        System.out.println("nhap b: ");
        double b = input.nextDouble();
        System.out.println("nhap c: ");
        double c = input.nextDouble();
        

        QuadraticEquation test = new QuadraticEquation(a,b,c);
        test.doCalculator();
    }
}
