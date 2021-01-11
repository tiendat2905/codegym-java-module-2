import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edge1, edge2, edge3;
        System.out.println("nhập vào độ dài edge 1");
        edge1 = scanner.nextInt();
        System.out.println("nhập vào độ dài edge 2");
        edge2 = scanner.nextInt();
        System.out.println("nhập vào độ dài edge 3");
        edge3 = scanner.nextInt();



        try {
            CheckTriangle(edge1, edge2, edge3);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("xu ly xong");
    }
    public static void CheckTriangle(int edge1, int edge2, int edge3) throws IllegalTriangleException {
        if (!(edge1 + edge2 - edge3 > 0) || !(edge1 + edge3 - edge2 > 0) || !(edge2 + edge3 - edge1 > 0)) {
            throw new IllegalTriangleException("tam giac khong hop le");
        }
        System.out.println("tam giac ok");
    }
}