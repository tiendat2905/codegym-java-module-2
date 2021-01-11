import java.util.*;

public class StudentManage {
    static Scanner scanner = new Scanner(System.in);
    static Map<Integer, Student> list = new HashMap<>();
    static ArrayList<Student> stList = new ArrayList<>();

    static {
        StudentFile.readList();
    }

    public static Student findStudentSubById(int id) {
       for (Student student: stList){
           if (id == student.getId())
               return student;
       }
       return null;
    }

    public static Student findStudentById(int id) {
        return list.get(id);
    }


    public static ArrayList<Student> findStudentByName(String name) {
        name = name.toLowerCase();
        for (Student student : list.values()) {
            if (student.getName().toLowerCase().contains(name)) {
                stList.add(student);
            }
        }
        return stList;
    }

    public static void removeStudentById() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student removing = findStudentById(id);

        if (removing != null) {
            int choice = -1;
            try {
                while (choice != 2) {
                    System.out.println("Bạn có muốn xóa học sinh này");
                    System.out.println("1.Yes");
                    System.out.println("2.No");
                    choice = Integer.parseInt(scanner.nextLine());
                    switch (choice) {
                        case 1:
                            list.remove(id);
                            StudentFile.saveList();
                            System.out.println("Đã xóa học sinh");
                            student();
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("Nhập sai, nhập lại");
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai mời nhập lại");
                removeStudentById();
            }
        } else {
            System.out.println("Không tìm thấy học sinh trong danh sách");
        }
    }

    public static void removeStudentByName() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        ArrayList<Student> removing = findStudentByName(name);
        if (removing.size() == 0){
            System.out.println("không tìm thấy hoc sinh trong danh sách");
            removing.clear();
        }
        if (removing.size() == 1) {
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
                            list.remove(name);
                            StudentFile.saveList();
                            System.out.println("Đã xóa học sinh");
                            student();
                            break;
                        case 2:
                            break;
                        default:
                            System.out.println("Nhập sai, nhập lại");
                    }
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai mời nhập lại");
                removeStudentByName();
            }
        }
        if (removing.size() > 1){
            Print.print(removing);
            System.out.println("Nhập id: ");
            int id = Integer.parseInt(scanner.nextLine());
            Student removing1 = findStudentSubById(id);

            if (removing1 != null) {
                int choice = -1;
                try {
                    while (choice != 2) {
                        System.out.println("Bạn có muốn xóa học sinh này");
                        System.out.println("1.Yes");
                        System.out.println("2.No");
                        choice = Integer.parseInt(scanner.nextLine());
                        switch (choice) {
                            case 1:
                                list.remove(id);
                                StudentFile.saveList();
                                System.out.println("Đã xóa học sinh");
                                student();
                                break;
                            case 2:
                                break;
                            default:
                                System.out.println("Nhập sai, nhập lại");
                        }
                    }
                } catch (NumberFormatException e) {
                    System.err.println("Nhập sai mời nhập lại");
                    removeStudentById();
                }
            } else {
                System.out.println("Không tìm thấy học sinh trong danh sách");
            }
        }
    }

    public static void remove() {
        int choice = -1;
        try {
            while (choice != 3) {
                Print.findMenu();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        removeStudentById();
                        break;
                    case 2:
                        removeStudentByName();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Nhập sai, nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            remove();
        }
    }

    public static void sortStudentByMediumScore()  {
        StudentFile.readList();
        List<Student> students = new ArrayList<>(list.values());
        SortStudentByMediumScore sortStudentByMediumScore = new SortStudentByMediumScore();
        students.sort(sortStudentByMediumScore);
        Print.print(students);
    }

    public static void student() {
        int choice = -1;
        try {
            while (choice != 9) {
                Print.printMenu();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1 -> Print.print(new ArrayList<>(StudentManage.list.values()));
                    case 2 -> AddStudent.addStudent();
                    case 3 -> AddStudent.modifyStudent();
                    case 4 -> remove();
                    case 5 -> AddStudentScore.studentScore();
                    case 6 -> AddStudentScore.addSeriesScore();
                    case 7 -> AddStudentScore.modifyStudentScore();
                    case 8 -> sortStudentByMediumScore();
                    case 9 -> System.out.println("Thoát chương trình");
                    default -> System.out.println("Nhập sai mời nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            student();
        }
    }


}
