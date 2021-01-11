import java.io.*;

public class StudentFile {
    public static void saveList() {
        try (
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("student.dat")));
        ) {
            oos.writeObject(StudentManage.hashMap);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Object readList() {
        try (
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("student.dat")));
        ) {
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }

    }
}
