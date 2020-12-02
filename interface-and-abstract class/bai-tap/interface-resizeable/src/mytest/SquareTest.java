package mytest;

import hinhhoc.Rectangle;
import hinhhoc.Square;
import myinterface.Colorable;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SquareTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("nhap side: ");
        double side = input.nextDouble();

        Square[] squares = new Square[2];
        for (int i = 0; i < squares.length; i++ ){
            squares[i] = new Square(side, side);
        }

        System.out.println(Arrays.toString(squares));

        Random random = new Random();

        for (int i = 0; i < squares.length; i++ ){
            squares[i].resize(random.nextInt(100) +1);
        }

        System.out.println(Arrays.toString(squares));

        for (Square square : squares) {
            if (square instanceof Colorable) {
                square.howToColor();
            }
        }


    }
}
