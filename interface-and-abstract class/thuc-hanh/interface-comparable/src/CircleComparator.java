import java.util.Comparator;

public class CircleComparator extends Circle implements Comparator<Circle> {
    public CircleComparator(double radius, String color) {
        super(radius, color);
    }

    public CircleComparator(double radius) {
        super(radius);
    }
    public CircleComparator() {
        super();

    }

    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }

    @Override
    public String toString() {
        return "CircleComparator{ " +
                    "color: "+getColor()+
                "}";
    }
}
