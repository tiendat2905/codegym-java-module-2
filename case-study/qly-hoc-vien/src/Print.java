import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Print {

    public static void studentMenu() {
        System.out.println("-------Sửa thông tin học viên--------");
        System.out.println("1.Sửa tên học sinh");
        System.out.println("2.Sửa giới tính học sinh");
        System.out.println("3.Sửa ngày tháng năm sinh học sinh");
        System.out.println("4.Quay lại menu");
    }

    public static void findMenu() {
        System.out.println("----------Tìm kiếm-----------");
        System.out.println("1.Tìm kiếm bằng id");
        System.out.println("2.Tìm kiếm bằng name");
        System.out.println("3.Quay lại");
    }


    public static void printMenuScore() {
        System.out.println("--------ScoreMenu---------");
        System.out.println("1.Nhập điểm hệ số 1 lần 1");
        System.out.println("2.Nhập điểm hệ số 1 lần 2");
        System.out.println("3.Nhập điểm hệ số 2");
        System.out.println("4.Nhập điểm hệ số 3");
        System.out.println("5.Quay lại Menu");
    }

    public static void printMenu() {
        System.out.println("--------------Menu-------------");
        System.out.println("1.Xem danh sách học viên");
        System.out.println("2.Thêm học viên");
        System.out.println("3.Sửa thông tin học viên");
        System.out.println("4.Xoá học viên");
        System.out.println("5.Nhập điểm học viên");
        System.out.println("6.Nhập điểm theo ô hệ số");
        System.out.println("7.Sửa nhập điểm học viên");
        System.out.println("8.Xếp loại học viên");
        System.out.println("9.Thoát");
        System.out.println("-------------------------------");
    }

    public static void print(List<Student> students) {
        System.out.format("%-6s | ", "ID");
        System.out.format("%-40s | ", "Name");
        System.out.format("%-5s | ", "Sex");
        System.out.format("%-10s | ", "dd/mm/yy");
        System.out.format("%-15s | ", "Điểm hệ số 1-1");
        System.out.format("%-15s | ", "Điểm hệ số 1-2");
        System.out.format("%-15s | ", "Điểm hệ số 2");
        System.out.format("%-15s | ", "Điểm hệ số 3");
        System.out.format("%-15s%n", "Điểm TB");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Student student : students) {
            System.out.format("%-6d | ", student.getId());
            System.out.format("%-40s | ", student.getName());
            System.out.format("%-5s | ", student.getSex());
            Date dob = student.getBirthday();
            String dobStr = Validate.simpleDateFormat.format(dob);
            System.out.format("%-10s | ", dobStr);
            float[] scores = student.getScore();
            for (float sc : scores) {
                if (sc == -1)
                    System.out.format("%-15s | ", " ");
                else
                    System.out.format("%-15.2f | ", sc);
            }
            System.out.format("%-15.2f%n", student.getMediumScore());
        }
    }

}
