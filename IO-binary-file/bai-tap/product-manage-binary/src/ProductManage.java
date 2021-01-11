import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManage {
    private static int currentId = 0;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Product> list = new ArrayList<>();

    static {
        Object read = readList();
        if (read != null) {
            list = (ArrayList<Product>) read;
            currentId = list.size();
        }
    }

    public static void addProduct() {
        System.out.println("nhập số lượng sản phẩm: ");
        int amount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < amount; i++) {
            System.out.println("Nhập sản phẩm: ");
            String productName = scanner.nextLine();
            System.out.println("nhập hãng sản xuất");
            String manufacturerProduct = scanner.nextLine();
            System.out.println("Nhập giá sản phẩm: ");
            double productPrice = Double.parseDouble(scanner.nextLine());

            list.add(new Product(++currentId, productName, manufacturerProduct, productPrice));
            saveList();
        }
    }

    public static Product findProductById(int id) {
        for (Product product : list) {
            if (id == product.getId()) {
                return product;
            }
        }
        return null;
    }

    public static void searchProductById() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Product product = findProductById(id);
        if (product == null) {
            System.out.println("Không tìm thấy sản phẩm");
            return;
        }
        System.out.println(product);
    }

    public static Product findProductByName(String name) {
        for (Product product : list) {
            if (name.equals(product.getProductName())) {
                return product;
            }
        }
        return null;
    }

    public static void searchNameProduct() {
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        Product product = findProductByName(name);
        if (product == null) {
            System.out.println("Không tìm thấy sản phẩm");
            return;
        }
        System.out.println(product);
    }

    public static void print() {
        System.out.println(list);
    }

    public static void printMenu() {
        System.out.println("Quản lý sản phẩm");
        System.out.println("1.Thêm sản phẩm");
        System.out.println("2.Tìm kiếm thông tin sản phẩm bằng tên");
        System.out.println("3.Tìm kiếm thông tin sản phẩm bằng id");
        System.out.println("4.Hiển thị thông tin sản phẩm");
        System.out.println("5.Thoát");
    }

    public static void product() {
        int choice = -1;
        while (choice != 5) {
            printMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    searchNameProduct();
                    break;
                case 3:
                    searchProductById();
                    break;
                case 4:
                    print();
                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Nhập sai mời nhập lại");
            }
        }
    }

    public static void saveList() {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("product.dat")));
        ) {
            oos.writeObject(list);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readList() {
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("product.dat")));
        ) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }
}
