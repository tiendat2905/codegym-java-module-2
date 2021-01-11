import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Print {
    public static void printMenu(){
        System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ DANH BẠ----");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhập");
        System.out.println("4. Xóa");
        System.out.println("5. Tìm kiếm");
        System.out.println("6. Đọc từ file");
        System.out.println("7. Ghi vào file");
        System.out.println("8. Thoát");
        System.out.print("Chọn chức năng: ");
    }

    public static void printSearch(){
        System.out.println("----find----");
        System.out.println("1.Tìm kiếm theo tên");
        System.out.println("2.Tìm kiếm theo số điện thoại");
        System.out.println("3.Quay lại");
    }

    public static void print(ArrayList<User> users) {
        System.out.println(Arrays.toString(new List[]{UserManage.userList}));
    }

    public static void printAll(){
        System.out.println(Arrays.toString(new List[]{UserManage.userList}));
    }
}
