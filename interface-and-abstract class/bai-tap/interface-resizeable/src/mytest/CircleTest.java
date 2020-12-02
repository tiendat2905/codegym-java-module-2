package mytest;

import hinhhoc.Circle;
import hinhhoc.Rectangle;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap radius: ");
        double radius = input.nextDouble();

        Circle[] circles= new Circle[1];
        for (int i = 0; i < circles.length; i++ ){
            circles[i] = new Circle(radius);
        }

        System.out.println(Arrays.toString(circles));

        Random random = new Random();

        for (int i = 0; i < circles.length; i++ ){
            circles[i].resize(random.nextInt(100) +1);
        }

        System.out.println(Arrays.toString(circles));
    }
}
