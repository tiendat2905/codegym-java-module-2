import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    private ArrayList<Product> arrayList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private static int id = 0;

    public void addProduct() {

        System.out.println("nhập số lượng sản phẩm: ");
        int amount = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < amount; i++) {
            id++;
            System.out.println("nhập sản phẩm: ");
            String productName = scanner.nextLine();
            System.out.println("nhập giá sản phẩm: ");
            Double productPrice = Double.parseDouble(scanner.nextLine());


            Product newProduct = new Product(id, productName, productPrice);
            arrayList.add(newProduct);
        }
    }

    public Product findProductById(int id) {
        for (Product product : arrayList) {
            if (id == product.getId()) {
                return product;
            }
        }
        return null;
    }

    public void removeProduct() {
        System.out.println("nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Product removing = findProductById(id);
        if (removing != null) {
            arrayList.remove(removing);
            System.out.println("đã xóa sản phẩm");
            System.out.println("============================");
        } else {
            System.out.println("không có trong danh sách sản phẩm");
        }
    }

    public void modifyProduct() {
        System.out.println("nhap id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Product thisProduct = findProductById(id);
        if (thisProduct == null) {
            System.out.println("Product not found");
            return;
        }
        System.out.println("nhập tên sản phẩm mới: ");
        String newName = scanner.nextLine();
        System.out.println("nhập giá mới");
        Double newPrice = Double.parseDouble(scanner.nextLine());
        thisProduct.setName(newName);
        thisProduct.setPrice(newPrice);
    }

    public Product searchName(String name) {
        for (Product product : arrayList) {
            if (name.equals(product.getName())) {
                return product;
            }
        }
        return null;
    }

    public void searchNameProduct() {
        System.out.println("nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        Product product = searchName(name);
        if (product == null) {
            System.out.println("không tìm thấy sản phẩm");
            return;
        }
        System.out.println(product);
    }


    public void print() {
        System.out.println(arrayList);
    }

    public void printMenu() {
        System.out.println("Quản lý sản phẩm");
        System.out.println("1.Thêm sản phẩm:");
        System.out.println("2.Sửa thông tin sản phẩm theo id:");
        System.out.println("3.Xóa sản phẩm theo id: ");
        System.out.println("4.Hiển thị danh sách sản phẩm:");
        System.out.println("5.Tìm kiếm sản phẩm theo tên:");
        System.out.println("6.Sắp xếp sản phẩm");
        System.out.println("7.Thoát");
    }

    public void product() {
        int choice = -1;

        while (choice != 7) {
            printMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    modifyProduct();
                    break;
                case 3:
                    removeProduct();
                    break;
                case 4:
                    print();
                    break;
                case 5:
                    searchNameProduct();
                    break;
                case 6:
                    Collections.sort(arrayList);
                    break;
                case 7:
                    System.out.println("Thoát chương trình");
                    break;
                default:
                    System.out.println("Nhập sai mời nhập lại");


            }
        }
    }

}
