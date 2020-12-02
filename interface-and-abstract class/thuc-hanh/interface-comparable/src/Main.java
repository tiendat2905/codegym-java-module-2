import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ComparableCircle[] circles = {new ComparableCircle(37,"white"),new ComparableCircle(60,"red"),new ComparableCircle(36,"blue")};
        System.out.println(Arrays.toString(circles));
        Arrays.sort(circles);
        System.out.println(Arrays.toString(circles));

    }
}
