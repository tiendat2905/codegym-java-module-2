import java.io.*;

public class UserFile {
    public static void saveList() {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("data/contacts.csv")));
        ) {
            oos.writeObject(UserManage.userList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readList() {
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("data/contacts.csv")));
        ) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }

    }
}
