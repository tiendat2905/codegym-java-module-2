import java.io.*;
import java.util.*;

public class StudentManage {
    private static int currentId = 0;

    static Scanner scanner = new Scanner(System.in);
    static Map<Integer, Student> hashMap = new HashMap<>();

    static {
        Object read = StudentFile.readList();
        if (read != null) {
            hashMap = (Map<Integer, Student>) read;
            currentId = hashMap.size();
        }
    }

    private static String inputName(String mess) {
        System.out.println(mess);
        try {
            String name = scanner.nextLine();
            if (name.length() > 25) throw new Exception();
            for (int i = 0; i < name.length(); i++) {
                String str = name.charAt(i) + "";
                if (!str.matches("[a-zA-Z ]")) {
                    throw new Exception();
                }
            }
            name = name.toLowerCase();
            name = name.trim();
            while (name.contains("  ")) {
                name = name.replace("  ", " ");
            }
            String[] str = name.split("");
            str[0] = str[0].toUpperCase();
            StringBuilder nameBuilder = new StringBuilder(str[0]);
            for (int i = 1; i < str.length; i++) {
                if (str[i].equals(" ")) {
                    str[i + 1] = str[i + 1].toUpperCase();
                }
                nameBuilder.append(str[i]);
            }
            return nameBuilder.toString();
        } catch (Exception e) {
            System.err.println("Trong tên không được có số hoặc quá dài");
            return inputName(mess);
        }
    }


    public static int inputNumber(String mess) {
        System.out.println(mess);
        try {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 0) {
                System.out.println("Nhập số dương");
                return inputNumber(mess);
            }
            return number;
        } catch (NumberFormatException e) {
            System.out.println("nhập là 1 số dương");
            return inputNumber(mess);
        }
    }

    public static float addStudentScore(String mess) {
        System.out.println(mess);
        while (true) {
            try {
                float score = Float.parseFloat(scanner.nextLine());
                if (score < 0 || score > 10.0) {
                    throw new NumberFormatException();
                }
                return score;
            } catch (NumberFormatException e) {
                System.err.println("Không hợp lệ! Nhập lại điểm học sinh trong khoảng 0->10");
                return addStudentScore(mess);
            }
        }
    }

    public static void addScore() {
        System.out.println("Nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        if (!hashMap.get(id).checkScore1 && !hashMap.get(id).checkScore2 && !hashMap.get(id).checkScore3 && !hashMap.get(id).checkScore4) {

            int sc1 = (int) addStudentScore("Nhập điểm hệ số 1 lần 1");
            hashMap.get(id).checkScore1 = true;
            hashMap.get(id).setStudentScore1(sc1);

            int sc2 = (int) addStudentScore("Nhập điểm hệ số 1 lần 2");
            hashMap.get(id).checkScore2 = true;
            hashMap.get(id).setStudentScore2(sc2);

            int sc3 = (int) addStudentScore("Nhập điểm hệ số 2: ");
            hashMap.get(id).checkScore3 = true;
            hashMap.get(id).setStudentScore3(sc3);

            int sc4 = (int) addStudentScore("Nhập điểm hệ số 3: ");
            hashMap.get(id).checkScore4 = true;
            hashMap.get(id).setStudentScore4(sc4);
        } else System.err.println("Điểm đã được nhập");
        StudentFile.saveList();
    }

    public static void addScore1() {
        System.out.println("Nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        if (!hashMap.get(id).checkScore1) {

            int sc = (int) addStudentScore("Nhập điểm hệ số 1 lần 1");
            hashMap.get(id).checkScore1 = true;
            hashMap.get(id).setStudentScore1(sc);
        } else System.err.println("Điểm đã được nhập");
        StudentFile.saveList();
    }

    public static void addScore2() {
        System.out.println("Nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        if (!hashMap.get(id).checkScore2) {
            int sc = (int) addStudentScore("Nhập điểm hệ số 1 lần 2");
            hashMap.get(id).checkScore2 = true;
            hashMap.get(id).setStudentScore2(sc);
        } else System.err.println("Điểm đã được nhập");
        StudentFile.saveList();
    }

    public static void addScore3() {
        System.out.println("Nhập id:");
        int id = Integer.parseInt(scanner.nextLine());

        if (!hashMap.get(id).checkScore3) {
            int sc = (int) addStudentScore("Nhập điểm hệ số 2: ");
            hashMap.get(id).checkScore3 = true;
            hashMap.get(id).setStudentScore3(sc);
        } else System.err.println("Điểm đã được nhập");
        StudentFile.saveList();
    }

    public static void addScore4() {
        System.out.println("Nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        if (!hashMap.get(id).checkScore4) {
            int sc = (int) addStudentScore("Nhập điểm hệ số 3: ");
            hashMap.get(id).checkScore4 = true;
            hashMap.get(id).setStudentScore4(sc);
        } else System.err.println("Điểm đã được nhập");
        StudentFile.saveList();
    }


    public static void addStudent() {
        int amount = inputNumber("nhập số lượng học sinh thêm vào: ");
        for (int i = 0; i < amount; i++) {
            String name = inputName("Nhập tên học sinh");
            Student student = new Student(++currentId, name);
            hashMap.put(student.getId(), student);
            StudentFile.saveList();
        }
    }

    public static Student findStudentById(int id) {
        return hashMap.get(id);
    }

    public static void modifyStudent() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student thisStudent = findStudentById(id);

        if (thisStudent == null) {
            System.out.println("Không tìm thấy học sinh");
            return;
        }

        String newName = inputName("Nhập tên học sinh mới: ");
        thisStudent.setName(newName);
        StudentFile.saveList();
    }

    public static void removeStudent() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student removing = findStudentById(id);

        if (removing != null) {
            hashMap.remove(id);
            StudentFile.saveList();
            System.out.println("Đã xóa học sinh");
        } else {
            System.out.println("Không tìm thấy học sinh trong danh sách");
        }
    }

    public static void modifyScore() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student score = findStudentById(id);
        if (score.checkScore1 && score.checkScore2 && score.checkScore3 && score.checkScore4) {
            if (score != null) {
                hashMap.get(id).setStudentScore1(addStudentScore("Nhập điểm hệ số 1 lần 1"));
                hashMap.get(id).setStudentScore1(addStudentScore("Nhập điểm hệ số 1 lần 2"));
                hashMap.get(id).setStudentScore1(addStudentScore("Nhập điểm hệ số 2"));
                hashMap.get(id).setStudentScore1(addStudentScore("Nhập điểm hệ số 3"));
            } else {
                System.out.println("Không tìm thấy điểm học sinh");
            }
        } else System.err.println("Điểm chưa được nhập không thể sửa");
        StudentFile.saveList();
    }

    public static void modifySore1() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student score = findStudentById(id);
        if (score.checkScore1) {
            if (score != null) {
                hashMap.get(id).setStudentScore1(addStudentScore("Nhập điểm hệ số 1 lần 1"));
            } else {
                System.out.println("Không tìm thấy điểm học sinh");
            }
        } else System.err.println("Điểm chưa được nhập không thể sửa");
        StudentFile.saveList();
    }

    public static void modifySore2() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student score = findStudentById(id);
        if (score.checkScore2) {
            if (score != null) {
                hashMap.get(id).setStudentScore2(addStudentScore("Nhập điểm hệ số 1 lần 1"));
            } else {
                System.out.println("Không tìm thấy điểm học sinh");
            }
        } else System.err.println("Điểm chưa được nhập không thể sửa");
        StudentFile.saveList();
    }

    public static void modifySore3() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student score = findStudentById(id);
        if (score.checkScore3) {
            if (score != null) {
                hashMap.get(id).setStudentScore3(addStudentScore("Nhập điểm hệ số 2"));
            } else {
                System.out.println("Không tìm thấy điểm học sinh");
            }
        } else System.err.println("Điểm chưa được nhập không thể sửa");
        StudentFile.saveList();
    }

    public static void modifySore4() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student score = findStudentById(id);
        if (score.checkScore4) {
            if (score != null) {
                hashMap.get(id).setStudentScore1(addStudentScore("Nhập điểm hệ số 3"));
            } else {
                System.out.println("Không tìm thấy điểm học sinh");
            }
        } else System.err.println("Điểm chưa được nhập không thể sửa");
        StudentFile.saveList();
    }


    public static void sortStudentByMediumScore() throws IOException, ClassNotFoundException {
        ObjectInputStream read = new ObjectInputStream(new FileInputStream("student.dat"));
        Object testFile = read.readObject();
        HashMap<Integer, Student> hashMap = (HashMap<Integer, Student>) testFile;
        List<Student> list = new ArrayList<Student>(hashMap.values());
        SortStudentByMediumScore sortStudentByMediumScore = new SortStudentByMediumScore();
        list.sort(sortStudentByMediumScore);
        Print.print(list);
    }
}
