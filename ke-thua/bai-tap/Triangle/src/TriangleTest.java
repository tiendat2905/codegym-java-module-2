import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap side1: ");
        double side1 = input.nextDouble();

        System.out.println("nhap side2: ");
        double side2 = input.nextDouble();

        System.out.println("nhap side3: ");
        double side3 = input.nextDouble();
        input.nextLine();

        System.out.println("nhap mau: ");
        String color = input.nextLine();

        Triangle triangle = new Triangle(side1, side2, side3, color);
        System.out.println(triangle);
    }
}
