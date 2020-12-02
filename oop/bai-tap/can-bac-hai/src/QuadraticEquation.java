public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a = a;
    }

    public double getB() {
        return this.b = b;
    }

    public double getC() {
        return this.c = c;
    }

    public double getDiscriminant() {
        return b * b - (4 * a * c);
    }

    public double getRoot1() {
        return (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    public double getRoot2() {
        return (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    public void doCalculator() {
        if (getDiscriminant() > 0) {
            System.out.println("Nghiem 1:" + getRoot1());
            System.out.println("Nghiem 2:" + getRoot2());
        } else if (getDiscriminant() == 0) {
            System.out.println("Nghiem kep:" + getRoot1());
        } else System.out.println("Vo nghiem");
    }
}
