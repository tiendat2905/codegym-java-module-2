import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Print {

    static Scanner scanner = new Scanner(System.in);

    public static void printMenuScore() {
        System.out.println("--------ScoreMenu---------");
        System.out.println("1.Nhập điểm hệ số 1 lần 1");
        System.out.println("2.Nhập điểm hệ số 1 lần 2");
        System.out.println("3.Nhập điểm hệ số 2");
        System.out.println("4.Nhập điểm hệ số 3");
        System.out.println("5.Nhập tất cả cột điểm");
        System.out.println("6.Quay lại Menu");
    }

    public static void studentScore() {
        int choice = -1;
        try {

            while (choice != 6) {
                printMenuScore();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        StudentManage.addScore1();
                        break;
                    case 2:
                        StudentManage.addScore2();
                        break;
                    case 3:
                        StudentManage.addScore3();
                        break;
                    case 4:
                        StudentManage.addScore4();
                        break;
                    case 5:
                        StudentManage.addScore();
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Nhập sai, nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            studentScore();
        }
    }

    public static void modifyStudentScore() {
        int choice = -1;
        try {

            while (choice != 6) {
                printMenuScore();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        StudentManage.modifySore1();
                        break;
                    case 2:
                        StudentManage.modifySore2();
                        break;
                    case 3:
                        StudentManage.modifySore3();
                        break;
                    case 4:
                        StudentManage.modifySore4();
                        break;
                    case 5:
                        StudentManage.modifyScore();
                        break;
                    case 6:
                        break;
                    default:
                        System.out.println("Nhập sai, nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            studentScore();
        }
    }

    public static void printMenu() {
        System.out.println("--------------Menu-------------");
        System.out.println("1.Xem danh sách học viên");
        System.out.println("2.Thêm học viên");
        System.out.println("3.Sửa thông tin học viên");
        System.out.println("4.Xoá học viên");
        System.out.println("5.Nhập điểm học viên");
        System.out.println("6.Sửa nhập điểm học viên");
        System.out.println("7.Xếp loại học viên");
        System.out.println("8.Thoát");
        System.out.println("-------------------------------");
    }

    public static void print(List<Student> students) {
        System.out.format("%-5s | ", "ID");
        System.out.format("%-30s | ", "Name");
        System.out.format("%-20s | ", "Điểm hệ số 1 lần 1");
        System.out.format("%-21s | ", "Điểm hệ số 1 lần 2");
        System.out.format("%-20s | ", "Điểm hệ số 2");
        System.out.format("%-20s | ", "Điểm hệ số 3");
        System.out.format("%-20s%n", "Điểm trung bình");
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        for (Student student : students) {
            System.out.format("%-5d | ", student.getId());
            System.out.format("%-30s | ", student.getName());
            System.out.format("%-20.1f | ", student.getStudentScore1());
            System.out.format("%-20.1f | ", student.getStudentScore2());
            System.out.format("%-20.1f | ", student.getStudentScore3());
            System.out.format("%-20.1f | ", student.getStudentScore4());
            System.out.format("%-20.1f%n", student.getMediumScore());
        }
    }

    public static void student() {
        int choice = -1;
        try {
            while (choice != 8) {
                printMenu();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        print(new ArrayList<>(StudentManage.hashMap.values()));
                        break;
                    case 2:
                        StudentManage.addStudent();
                        break;
                    case 3:
                        StudentManage.modifyStudent();
                        break;
                    case 4:
                        StudentManage.removeStudent();
                        break;
                    case 5:
                        studentScore();
                        break;
                    case 6:
                        modifyStudentScore();
                        break;
                    case 7:
                        try {
                            StudentManage.sortStudentByMediumScore();
                        } catch (IOException | ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                        break;
                    case 8:
                        System.out.println("Thoát chương trình");
                        break;
                    default:
                        System.out.println("Nhập sai mời nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            student();
        }
    }
}
