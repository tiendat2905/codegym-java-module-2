package mytest;

import hinhhoc.Rectangle;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RectangleTest  {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap width: ");
        double width = input.nextDouble();

        System.out.println("nhap length: ");
        double length = input.nextDouble();

        Rectangle[] rectangles = new Rectangle[2];
        for (int i = 0; i < rectangles.length; i++ ){
            rectangles[i] = new Rectangle(width, length);
        }

        System.out.println(Arrays.toString(rectangles));

        Random random = new Random();

        for (int i = 0; i < rectangles.length; i++ ){
            rectangles[i].resize(random.nextInt(100) +1);
        }

        System.out.println(Arrays.toString(rectangles));




    }
}
