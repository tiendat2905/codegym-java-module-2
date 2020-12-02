import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c;

        System.out.println("a: ");
        a = scanner.nextDouble();

        System.out.println("b: ");
        b = scanner.nextDouble();

        System.out.println("c: ");
        c = scanner.nextDouble();

        if (a != 0){
            double solution = -b / a;
            System.out.printf("The solution is: %f!", solution);
        }

        if (a != 0){
            double answer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
            if (b == 0){
                System.out.print("The solution is all x!");
            }else {
                System.out.print("No solution!");
            }
        }
    }
}
