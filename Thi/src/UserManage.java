import java.util.*;

public class UserManage {
    static List<User> userList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<User> stList = new ArrayList<>();

    public static void addUser() {
        int amount = Validate.validateNumber("nhập số lượng muốn thêm vào: ");
        for (int i = 0; i < amount; i++) {
            String phoneNumber = null;
            while (phoneNumber == null) {
                phoneNumber = Validate.validatePhoneNumber("Nhập số điện thoại: ");
            }

            System.out.println("Nhập nhóm: ");
            String group = scanner.nextLine();

            String name = Validate.validateName("Nhập tên người dùng: ");

            String sex = Validate.validateSex("Nhập giới tính: " + "(nam-Nam, nu-Nu)");

            String address = Validate.validateAddress();

            String birthday = Validate.validateDayOfBirth();

            System.out.println("nhập email: ");
            String email;
            do {
                email = scanner.nextLine();
            } while (!Validate.isEmailValid(email));
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
        ArrayList<User> users = findByPhoneNumber(phone);
        if (users.size() == 0) {
            System.out.println("không tìm thấy số trong danh bạ");
            users.clear();
            return;
        }

        for (User user : users) {
            System.out.println("Nhập nhóm: ");
            String group = scanner.nextLine();
            user.setGroup(group);
            user.setName(Validate.validateName("Nhập tên người dùng: "));

            user.setSex(Validate.validateSex("Nhập giới tính: " + "(nam-Nam, nu-Nu)"));

            user.setAddress(Validate.validateAddress());

            user.setBirthday(Validate.validateDayOfBirth());

            System.out.println("nhập email: ");
            String email;
            do {
                email = scanner.nextLine();
                user.setEmail(email);
            } while (!Validate.isEmailValid(email));
        }

    }

    public static void searchUserByName() {
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        ArrayList<User> user = findByName(name);
        if (user.size() == 0) {
            System.out.println("không tìm thấy");
            return;
        }
        System.out.println(user);
    }

    public static void searchUserByPhoneNumber() {
        System.out.println("nhập số điện thoại");
        String phone = scanner.nextLine();
        ArrayList<User> user = findByPhoneNumber(phone);
        if (user.size() == 0) {
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

    public static void saveToCVS() {
        UserFile.saveList();
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
                        saveToCVS();
                        user();
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

    public static void readFromCVS() {
        List<User> users = UserFile.readList();
        if (users != null)
            userList = users;
    }

    public static void readFileCVS() {
        int choice = -1;
        try {
            while (choice != 2) {
                System.out.println("Đọc CVS sẽ xóa toàn bộ dữ liệu trong bộ nhớ trước khi nhập dữ liệu mới");
                System.out.println("1.Yes");
                System.out.println("2.No");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        readFromCVS();
                        user();
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

    public static void removeUser() {
        System.out.println("Nhập số điện thoại: ");
        String phone = scanner.nextLine();
        ArrayList<User> removing = findByPhoneNumber(phone);

        if (removing.size() == 0) {
            System.out.println("không tìm thấy trong danh bạ");
            removing.clear();
        } else {
            Print.print(removing);
            int choice = -1;
            try {
                while (choice != 2) {
                    System.out.println("Bạn có muốn xóa không");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            userList.remove(phone);
                            System.out.println("Đã xóa danh bạ");
                            user();
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
                    case 5 -> searchUser();
                    case 6 -> readFileCVS();
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

