import java.io.*;
import java.util.*;

public class UserFile {
    private static final String fileName = "data/contacts.csv";

    static {
        new File("data/").mkdirs();
    }

    public static void saveList() {
        try (PrintWriter fileWriter = new PrintWriter(fileName)) {
            for (User user : UserManage.userList) {
                fileWriter.println(user.getCVS());
            }
            System.out.println("Luu CSV thanh cong");
        } catch (IOException e) {
            System.out.println("Luu CSV that bai: " + e.getMessage());
        }
    }

    public static List<User> readList() {
        try (Scanner scanner = new Scanner(new File(fileName))) {
            List<User> users = new ArrayList<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split(",");
                String phoneNumber = fields[0];
                String group = fields[1];
                String fullName = fields[2];
                String gender = fields[3];
                String address = fields[4];
                String email = fields[5];
                String dob = fields[6];
                User user = new User(phoneNumber, group, fullName, gender, address, dob,email);
                users.add(user);
            }
            System.out.println("Doc CSV thanh cong.");
            return users;
        } catch (FileNotFoundException e) {
            System.out.println("Doc CSV that bai: " + e.getMessage());
            return null;
        }
    }

}
