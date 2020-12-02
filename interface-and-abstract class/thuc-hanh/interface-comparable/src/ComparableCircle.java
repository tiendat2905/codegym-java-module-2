public class ComparableCircle extends Circle
        implements Comparable<ComparableCircle> {


    public ComparableCircle(double radius,String color) {
        super(radius,color);
    }


    @Override
    public int compareTo(ComparableCircle o) {
        if (getColor().length() < o.getColor().length()) return 1;
        else if (getColor().length() > o.getColor().length()) return -1;
        else return 1;
    }

    @Override
    public String toString() {
        return "ComparableCircle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}