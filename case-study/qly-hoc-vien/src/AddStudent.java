import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AddStudent {
    public static int currentId = 0;
    static Scanner scanner = new Scanner(System.in);


    public static void addStudent() {
        int amount = Validate.validateNumber("nhập số lượng học sinh thêm vào: ");
        for (int i = 0; i < amount; i++) {
            String name = Validate.validateName("Nhập tên học sinh: ");

            String sex = Validate.validateSex("Nhập giới tính: " + "(nam-Nam, nu-Nu)");


            Date birthday = null;
            while (birthday == null) {
                System.out.println("Nhập ngày tháng năm sinh: " + "(dd/MM/yyyy)");
                String value = scanner.nextLine();
                birthday = Validate.validateDate(value);
            }

            Student student = new Student(++currentId, name, sex, birthday);
            StudentManage.list.put(student.getId(), student);
            StudentFile.saveList();
        }
    }

    public static void modifyStudentNameById(){
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student thisStudent = StudentManage.findStudentById(id);

        if (thisStudent == null) {
            System.out.println("Không tìm thấy học sinh");
            return;
        }

        String newName = Validate.validateName("Nhập tên học sinh mới: ");
        thisStudent.setName(newName);
        StudentFile.saveList();
    }

    public static void modifyStudentNameByName(){
        System.out.println("Nhập tên học sinh: ");
        String name = scanner.nextLine();
        ArrayList<Student> thisStudent = StudentManage.findStudentByName(name);

        if (thisStudent.size() == 0) {
            System.out.println("Không tìm thấy học sinh");
            thisStudent.clear();
        }

        if (thisStudent.size() > 1){
            Print.print(thisStudent);
            System.out.println("Nhập id: ");
            int id = Integer.parseInt(scanner.nextLine());
            Student student = StudentManage.findStudentSubById(id);

            if (student == null) {
                System.out.println("Không tìm thấy học sinh");
                return;
            }

            String newName = Validate.validateName("Nhập tên học sinh mới: ");
            student.setName(newName);
            StudentFile.saveList();
        }

        if (thisStudent.size() == 1){
            Print.print(thisStudent);
            String newName = Validate.validateName("Nhập tên học sinh mới: ");
            thisStudent.get(0).setName(newName);
            StudentFile.saveList();
        }
    }

    public static void modifyStudentSexById(){
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student thisStudent = StudentManage.findStudentById(id);

        if (thisStudent == null) {
            System.out.println("Không tìm thấy học sinh");
            return;
        }

        String newSex = Validate.validateSex("Nhập giới tính mới: ");
        thisStudent.setSex(newSex);
        StudentFile.saveList();
    }

    public static void modifyStudentSexByName(){
        System.out.println("Nhập tên học sinh: ");
        String name = scanner.nextLine();
        ArrayList<Student> thisStudent = StudentManage.findStudentByName(name);

        if (thisStudent.size() == 0) {
            System.out.println("Không tìm thấy học sinh");
            thisStudent.clear();
        }

        if (thisStudent.size() > 1){
            Print.print(thisStudent);
            System.out.println("Nhập id: ");
            int id = Integer.parseInt(scanner.nextLine());
            Student student = StudentManage.findStudentSubById(id);

            if (student == null) {
                System.out.println("Không tìm thấy học sinh");
                return;
            }

            String newSex = Validate.validateSex("Nhập giới tính mới: ");
            student.setSex(newSex);
            StudentFile.saveList();
        }

        if (thisStudent.size() == 1){
            Print.print(thisStudent);
            String newSex = Validate.validateName("Nhập giới tính học sinh mới: ");
            thisStudent.get(0).setSex(newSex);
            StudentFile.saveList();
        }
    }

    public static void modifyStudentDateById(){
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student thisStudent = StudentManage.findStudentById(id);

        if (thisStudent == null) {
            System.out.println("Không tìm thấy học sinh");
            return;
        }

        System.out.println("Nhập ngày tháng năm sinh: ");
        String value = scanner.nextLine();
        Date birthday = Validate.validateDate(value);
        thisStudent.setBirthday(birthday);
        StudentFile.saveList();
    }

    public static void modifyStudentDateByName(){
        System.out.println("Nhập tên học sinh: ");
        String name = scanner.nextLine();
        ArrayList<Student> thisStudent = StudentManage.findStudentByName(name);

        if (thisStudent.size() == 0) {
            System.out.println("Không tìm thấy học sinh");
            thisStudent.clear();
        }

        if (thisStudent.size() > 1){
            Print.print(thisStudent);
            System.out.println("Nhập id: ");
            int id = Integer.parseInt(scanner.nextLine());
            Student student = StudentManage.findStudentSubById(id);

            if (student == null) {
                System.out.println("Không tìm thấy học sinh");
                return;
            }

            System.out.println("Nhập ngày tháng năm sinh: ");
            String value = scanner.nextLine();
            Date birthday = Validate.validateDate(value);
            student.setBirthday(birthday);
            StudentFile.saveList();
        }

        if (thisStudent.size() == 1){
            Print.print(thisStudent);
            System.out.println("Nhập ngày tháng năm sinh: ");
            String value = scanner.nextLine();
            Date birthday = Validate.validateDate(value);
            thisStudent.get(0).setBirthday(birthday);
            StudentFile.saveList();
        }
    }

    public static void modifyStudentName() {
        int choice = -1;
        try {
            while (choice != 3) {
                Print.findMenu();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        modifyStudentNameById();
                        break;
                    case 2:
                        modifyStudentNameByName();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Nhập sai, nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            modifyStudentName();
        }
    }

    public static void modifyStudentSex() {
        int choice = -1;
        try {
            while (choice != 3) {
                Print.findMenu();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        modifyStudentSexById();
                        break;
                    case 2:
                        modifyStudentSexByName();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Nhập sai, nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            modifyStudentSex();
        }
    }

    public static void modifyStudentDate() {
        int choice = -1;
        try {
            while (choice != 3) {
                Print.findMenu();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        modifyStudentDateById();
                        break;
                    case 2:
                        modifyStudentDateByName();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Nhập sai, nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            modifyStudentDate();
        }
    }

    public static void modifyStudent() {
        int choice = -1;
        try {
            while (choice != 4) {
                Print.studentMenu();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        modifyStudentName();
                        break;
                    case 2:
                        modifyStudentSex();
                        break;
                    case 3:
                        modifyStudentDate();
                        break;
                    case 4:
                        break;
                    default:
                        System.out.println("Nhập sai, nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            modifyStudent();
        }
    }
}
