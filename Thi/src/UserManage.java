import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class UserManage {
    static List<User> userList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<User> stList = new ArrayList<>();

    public static void addUser() {
        int amount = Validate.validateNumber("nhập số lượng muốn thêm vào: ");
        for (int i = 0; i < amount; i++) {
            String phoneNumber = Validate.validatePhoneNumber("Nhập số điện thoại: ");
            System.out.println("Nhập nhóm: ");
            String group = scanner.nextLine();
            String name = Validate.validateName("Nhập tên người dùng: ");
            String sex = Validate.validateSex("Nhập giới tính: " + "(nam-Nam, nu-Nu)");
            System.out.println("Nhập địa chỉ");
            String address = scanner.nextLine();
            Date birthday = null;
            while (birthday == null) {
                System.out.println("Nhập ngày tháng năm sinh: " + "(dd/MM/yyyy)");
                String value = scanner.nextLine();
                birthday = Validate.validateDate(value);
            }
            System.out.println("nhập email: ");
            String email = scanner.nextLine();
            User user = new User(phoneNumber, group, name, sex, address, birthday, email);
            userList.add(user);
        }
    }

    public static ArrayList<User> findByName(String name) {
        name = name.toLowerCase();
        for (User user : userList) {
            if (user.getName().toLowerCase().contains(name)) {
                stList.add(user);
            }
        }
        return stList;
    }

    public static ArrayList<User> findByPhoneNumber(String phone) {
        for (User user : userList) {
            if (user.getPhoneNumber().contains(phone)) {
                stList.add(user);
            }
        }
        return stList;
    }

    public static void updatePhone() {
        System.out.println("nhập số điện thoại");
        String phone = scanner.nextLine();
        ArrayList<User> user = findByPhoneNumber(phone);
        if (user.size() == 0) {
            System.out.println("không tìm thấy số trong danh bạ");
            user.clear();
        }else {
            System.out.println("nhập nhóm mới: ");
            String group = scanner.nextLine();
            userList.get(Integer.parseInt(phone)).setGroup(group);
            userList.get(Integer.parseInt(phone)).setName("nhập tên mới");
            userList.get(Integer.parseInt(phone)).setSex("Nhập giới tính");
            System.out.println("nhập địa chỉ mới: ");
            String address = scanner.nextLine();
            userList.get(Integer.parseInt(phone)).setAddress(address);
            System.out.println("nhập email: ");
            String email = scanner.nextLine();
            userList.get(Integer.parseInt(phone)).setEmail(email);
        }
    }

    public static void searchUserByName() {
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        ArrayList<User> user = findByName(name);
        if (user == null) {
            System.out.println("không tìm thấy");
            return;
        }
        System.out.println(user);
    }

    public static void searchUserByPhoneNumber() {
        System.out.println("nhập số điện thoại");
        String phone = scanner.nextLine();
        ArrayList<User> user = findByName(phone);
        if (user == null) {
            System.out.println("không tìm thấy");
            return;
        }
        System.out.println(user);
    }

    public static void searchUser() {
        int choice = -1;
        try {
            while (choice != 3) {
                Print.printSearch();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        searchUserByName();
                        break;
                    case 2:
                        searchUserByPhoneNumber();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Nhập sai, nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            searchUser();
        }
    }

    public static void writeFile() {
        int choice = -1;
        try {
            while (choice != 2) {
                System.out.println("Bạn có muốn cập nhật danh bạ không");
                System.out.println("1.Yes");
                System.out.println("2.No");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        UserFile.saveList();
                        break;
                    case 2:
                        break;
                    default:
                        System.out.println("Nhập sai, nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            writeFile();
        }
    }

    public static void readFile(){

    }

    public static void removeUser() {
        System.out.println("Nhập số điện thoại: ");
        String phone = scanner.nextLine();
        ArrayList<User> removing = findByPhoneNumber(phone);
        if (removing.size() == 0){
            System.out.println("không tìm thấy hoc sinh trong danh sách");
            removing.clear();
        }else
            Print.print(removing);
            int choice = -1;
            try {
                while (choice != 2) {
                    System.out.println("Bạn có muốn xóa học sinh này");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            userList.remove(phone);
                            UserFile.saveList();
                            System.out.println("Đã xóa học sinh");
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("Nhập sai, nhập lại");
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai mời nhập lại");
                removeUser();
            }
        }


    public static void user() {
        int choice = -1;
        try {
            while (choice != 8) {
                Print.printMenu();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1 -> Print.printAll();
                    case 2 -> addUser();
                    case 3 -> updatePhone();
                    case 4 -> removeUser();
                    case 5 ->searchUser();
//                    case 6 ->
                    case 7 -> writeFile();
                    case 8 -> System.out.println("Thoát chương trình");
                    default -> System.out.println("Nhập sai mời nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            user();
        }
    }
}

