import java.util.Scanner;

public class Triangle extends Shape {
    private String color;

    public Triangle(){}

    public Triangle(String color) {
        this.color = color;
    }

    public Triangle(double side1, double side2, double side3, String color) {
        super(side1, side2, side3);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + getSide1() +
                ", side2=" + getSide2() +
                ", side3=" + getSide3() +
                " color='" + color + '\'' +
                '}' + " Chu vi: " + getPerimeter() + " Dien tich: " + getArea();
    }
}
