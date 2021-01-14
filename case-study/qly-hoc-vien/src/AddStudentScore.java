import java.util.ArrayList;
import java.util.Scanner;

public class AddStudentScore {
    static Scanner scanner = new Scanner(System.in);

    public static void addScore1ById() {
        System.out.println("Nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        Student score = StudentManage.findStudentById(id);
        if (score == null) {
            System.out.println("không tìm thấy học sinh");
            return;
        }

        if (!score.flag1) {
            float sc = Validate.validateScore("Nhập điểm: ");
            score.flag1 = true;
            score.setScore(sc, 0);

        } else System.err.println("Điểm đã được nhập");
        StudentFile.saveList();
    }

    public static void addScore2ById() {
        System.out.println("Nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        Student score = StudentManage.findStudentById(id);
        if (score == null) {
            System.out.println("không tìm thấy học sinh");
            return;
        }

        if (!score.flag2) {

            float sc = Validate.validateScore("Nhập điểm: ");
            score.flag2 = true;
            score.setScore(sc, 1);

        } else System.err.println("Điểm đã được nhập");
        StudentFile.saveList();
    }

    public static void addScore3ById() {
        System.out.println("Nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        Student score = StudentManage.findStudentById(id);
        if (score == null) {
            System.out.println("không tìm thấy học sinh");
            return;
        }

        if (!score.flag3) {

            float sc = Validate.validateScore("Nhập điểm: ");
            score.flag3 = true;
            score.setScore(sc, 2);

        } else System.err.println("Điểm đã được nhập");
        StudentFile.saveList();
    }

    public static void addScore4ById() {
        System.out.println("Nhập id:");
        int id = Integer.parseInt(scanner.nextLine());
        Student score = StudentManage.findStudentById(id);
        if (score == null) {
            System.out.println("không tìm thấy học sinh");
            return;
        }

        if (!score.flag4) {

            float sc = Validate.validateScore("Nhập điểm: ");
            score.flag4 = true;
            score.setScore(sc, 3);

        } else System.err.println("Điểm đã được nhập");
        StudentFile.saveList();
    }

    public static void addScore1ByName() {
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        ArrayList<Student> student = StudentManage.findStudentByName(name);
        if (student.size() == 0) {
            System.out.println("không tìm thấy học sinh");
            student.clear();
        }
        if (student.size() > 1) {
            Print.print(student);
            System.out.println("Nhập id:");
            int id = Integer.parseInt(scanner.nextLine());
            Student student1 = StudentManage.findStudentSubById(id);
            if (student1 == null) {
                System.out.println("không tìm thấy học sinh");
                return;
            }

            if (!student1.flag1) {
                float sc = Validate.validateScore("Nhập điểm: ");
                student1.flag1 = true;
                student1.setScore(sc, 0);

            } else System.err.println("Điểm đã được nhập");
            StudentFile.saveList();
        }
        if (student.size() == 1) {
            if (!student.get(0).flag1) {

                float sc = Validate.validateScore("Nhập điểm: ");
                student.get(0).flag1 = true;
                student.get(0).setScore(sc, 0);

            } else System.err.println("Điểm đã được nhập");
            StudentFile.saveList();
        }
    }

    public static void addScore2ByName() {
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        ArrayList<Student> student = StudentManage.findStudentByName(name);
        if (student.size() == 0) {
            System.out.println("không tìm thấy học sinh");
            student.clear();
        }
        if (student.size() > 1) {
            Print.print(student);
            System.out.println("Nhập id:");
            int id = Integer.parseInt(scanner.nextLine());
            Student student1 = StudentManage.findStudentSubById(id);
            if (student1 == null) {
                System.out.println("không tìm thấy học sinh");
                return;
            }

            if (!student1.flag2) {
                float sc = Validate.validateScore("Nhập điểm: ");
                student1.flag2 = true;
                student1.setScore(sc, 1);

            } else System.err.println("Điểm đã được nhập");
            StudentFile.saveList();
        }
        if (student.size() == 1) {
            if (!student.get(0).flag2) {

                float sc = Validate.validateScore("Nhập điểm: ");
                student.get(0).flag2 = true;
                student.get(0).setScore(sc, 1);

            } else System.err.println("Điểm đã được nhập");
            StudentFile.saveList();
        }
    }

    public static void addScore3ByName() {
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        ArrayList<Student> student = StudentManage.findStudentByName(name);
        if (student.size() == 0) {
            System.out.println("không tìm thấy học sinh");
            student.clear();
        }
        if (student.size() > 1) {
            Print.print(student);
            System.out.println("Nhập id:");
            int id = Integer.parseInt(scanner.nextLine());
            Student student1 = StudentManage.findStudentSubById(id);
            if (student1 == null) {
                System.out.println("không tìm thấy học sinh");
                return;
            }

            if (!student1.flag3) {
                float sc = Validate.validateScore("Nhập điểm: ");
                student1.flag3 = true;
                student1.setScore(sc, 2);

            } else System.err.println("Điểm đã được nhập");
            StudentFile.saveList();
        }
        if (student.size() == 1) {
            if (!student.get(0).flag3) {

                float sc = Validate.validateScore("Nhập điểm: ");
                student.get(0).flag3 = true;
                student.get(0).setScore(sc, 2);

            } else System.err.println("Điểm đã được nhập");
            StudentFile.saveList();
        }
    }

    public static void addScore4ByName() {
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        ArrayList<Student> student = StudentManage.findStudentByName(name);
        if (student.size() == 0) {
            System.out.println("không tìm thấy học sinh");
            student.clear();
        }
        if (student.size() > 1) {
            Print.print(student);
            System.out.println("Nhập id:");
            int id = Integer.parseInt(scanner.nextLine());
            Student student1 = StudentManage.findStudentSubById(id);
            if (student1 == null) {
                System.out.println("không tìm thấy học sinh");
                return;
            }

            if (!student1.flag4) {
                float sc = Validate.validateScore("Nhập điểm: ");
                student1.flag4 = true;
                student1.setScore(sc, 3);

            } else System.err.println("Điểm đã được nhập");
            StudentFile.saveList();
        }
        if (student.size() == 1) {
            if (!student.get(0).flag4) {

                float sc = Validate.validateScore("Nhập điểm: ");
                student.get(0).flag4 = true;
                student.get(0).setScore(sc, 3);

            } else System.err.println("Điểm đã được nhập");
            StudentFile.saveList();
        }
    }

    public static void modifyScore1ById() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student score = StudentManage.findStudentById(id);
        if (score == null) {
            System.out.println("không tìm thấy học sinh");
            return;
        }

        if (score.flag1) {
            score.setScore(Validate.validateScore("Nhập điểm: "), 0);
        } else System.err.println("Điểm chưa được nhập không thể sửa");
        StudentFile.saveList();
    }

    public static void modifyScore2ById() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student score = StudentManage.findStudentById(id);
        if (score == null) {
            System.out.println("không tìm thấy học sinh");
            return;
        }

        if (score.flag2) {
            score.setScore(Validate.validateScore("Nhập điểm: "), 1);

        } else System.err.println("Điểm chưa được nhập không thể sửa");
        StudentFile.saveList();
    }

    public static void modifyScore3ById() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student score = StudentManage.findStudentById(id);
        if (score == null) {
            System.out.println("không tìm thấy học sinh");
            return;
        }

        if (score.flag3) {
            score.setScore(Validate.validateScore("Nhập điểm: "), 2);
        } else System.err.println("Điểm chưa được nhập không thể sửa");
        StudentFile.saveList();
    }

    public static void modifyScore4ById() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student score = StudentManage.findStudentById(id);
        if (score == null) {
            System.out.println("không tìm thấy học sinh");
            return;
        }

        if (score.flag4) {
            score.setScore(Validate.validateScore("Nhập điểm: "), 3);
        } else System.err.println("Điểm chưa được nhập không thể sửa");
        StudentFile.saveList();
    }

    public static void modifyScore1ByName() {
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        ArrayList<Student> score = StudentManage.findStudentByName(name);
        if (score.size() == 0) {
            System.out.println("không tìm thấy học sinh");
            score.clear();
        }

        if (score.size() > 1) {
            Print.print(score);
            System.out.println("Nhập id: ");
            int id = Integer.parseInt(scanner.nextLine());
            Student score1 = StudentManage.findStudentSubById(id);
            if (score1 == null) {
                System.out.println("không tìm thấy học sinh");
                return;
            }

            if (score1.flag1) {
                score1.setScore(Validate.validateScore("Nhập điểm: "), 0);
            } else System.err.println("Điểm chưa được nhập không thể sửa");
            StudentFile.saveList();
        }

        if (score.size() == 1) {
            if (score.get(0).flag1) {
                score.get(0).setScore(Validate.validateScore("Nhập điểm: "), 0);

            } else System.err.println("Điểm chưa được nhập không thể sửa");
            StudentFile.saveList();
        }
    }


    public static void modifyScore2ByName() {
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        ArrayList<Student> score = StudentManage.findStudentByName(name);
        if (score.size() == 0) {
            System.out.println("không tìm thấy học sinh");
            score.clear();
        }

        if (score.size() > 1) {
            Print.print(score);
            System.out.println("Nhập id: ");
            int id = Integer.parseInt(scanner.nextLine());
            Student score1 = StudentManage.findStudentSubById(id);
            if (score1 == null) {
                System.out.println("không tìm thấy học sinh");
                return;
            }

            if (score1.flag2) {
                score1.setScore(Validate.validateScore("Nhập điểm: "), 1);
            } else System.err.println("Điểm chưa được nhập không thể sửa");
            StudentFile.saveList();
        }

        if (score.size() == 1) {

            if (score.get(0).flag2) {
                score.get(0).setScore(Validate.validateScore("Nhập điểm: "), 1);

            } else System.err.println("Điểm chưa được nhập không thể sửa");
            StudentFile.saveList();
        }
    }


    public static void modifyScore3ByName() {
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        ArrayList<Student> score = StudentManage.findStudentByName(name);
        if (score.size() == 0) {
            System.out.println("không tìm thấy học sinh");
            score.clear();
        }

        if (score.size() > 1) {
            Print.print(score);
            System.out.println("Nhập id: ");
            int id = Integer.parseInt(scanner.nextLine());
            Student score1 = StudentManage.findStudentSubById(id);
            if (score1 == null) {
                System.out.println("không tìm thấy học sinh");
                return;
            }

            if (score1.flag3) {
                score1.setScore(Validate.validateScore("Nhập điểm: "), 2);
            } else System.err.println("Điểm chưa được nhập không thể sửa");
            StudentFile.saveList();
        }

        if (score.size() == 1) {

            if (score.get(0).flag3) {
                score.get(0).setScore(Validate.validateScore("Nhập điểm: "), 2);

            } else System.err.println("Điểm chưa được nhập không thể sửa");
            StudentFile.saveList();
        }
    }


    public static void modifyScore4ByName() {
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        ArrayList<Student> score = StudentManage.findStudentByName(name);
        if (score.size() == 0) {
            System.out.println("không tìm thấy học sinh");
            score.clear();
        }

        if (score.size() > 1) {
            Print.print(score);
            System.out.println("Nhập id: ");
            int id = Integer.parseInt(scanner.nextLine());
            Student score1 = StudentManage.findStudentSubById(id);
            if (score1 == null) {
                System.out.println("không tìm thấy học sinh");
                return;
            }

            if (score1.flag4) {
                score1.setScore(Validate.validateScore("Nhập điểm: "), 3);
            } else System.err.println("Điểm chưa được nhập không thể sửa");
            StudentFile.saveList();
        }

        if (score.size() == 1) {

            if (score.get(0).flag4) {
                score.get(0).setScore(Validate.validateScore("Nhập điểm: "), 3);

            } else System.err.println("Điểm chưa được nhập không thể sửa");
            StudentFile.saveList();
        }
    }

    public static void addStudentScore1() {
        int choice = -1;
        try {
            while (choice != 3) {
                Print.findMenu();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        addScore1ById();
                        break;
                    case 2:
                        addScore1ByName();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Nhập sai, nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            addStudentScore1();
        }
    }

    public static void addStudentScore2() {
        int choice = -1;
        try {
            while (choice != 3) {
                Print.findMenu();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        addScore2ById();
                        break;
                    case 2:
                        addScore2ByName();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Nhập sai, nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            addStudentScore2();
        }
    }

    public static void addStudentScore3() {
        int choice = -1;
        try {
            while (choice != 3) {
                Print.findMenu();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        addScore3ById();
                        break;
                    case 2:
                        addScore3ByName();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Nhập sai, nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            addStudentScore3();
        }
    }

    public static void addStudentScore4() {
        int choice = -1;
        try {
            while (choice != 3) {
                Print.findMenu();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        addScore4ById();
                        break;
                    case 2:
                        addScore4ByName();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Nhập sai, nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            addStudentScore4();
        }
    }

    public static void modifyStudentScore2() {
        int choice = -1;
        try {
            while (choice != 3) {
                Print.findMenu();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        modifyScore2ById();
                        break;
                    case 2:
                        modifyScore2ByName();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Nhập sai, nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            modifyStudentScore2();
        }
    }

    public static void modifyStudentScore3() {
        int choice = -1;
        try {
            while (choice != 3) {
                Print.findMenu();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        modifyScore3ById();
                        break;
                    case 2:
                        modifyScore3ByName();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Nhập sai, nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            modifyStudentScore3();
        }
    }

    public static void modifyStudentScore4() {
        int choice = -1;
        try {
            while (choice != 3) {
                Print.findMenu();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        modifyScore4ById();
                        break;
                    case 2:
                        modifyScore4ByName();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Nhập sai, nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            modifyStudentScore4();
        }
    }

    public static void modifyStudentScore1() {
        int choice = -1;
        try {
            while (choice != 3) {
                Print.findMenu();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        modifyScore1ById();
                        break;
                    case 2:
                        modifyScore1ByName();
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("Nhập sai, nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            modifyStudentScore1();
        }
    }

    public static void studentScore() {
        int choice = -1;
        try {

            while (choice != 5) {
                Print.printMenuScore();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        addStudentScore1();
                        break;
                    case 2:
                        addStudentScore2();
                        break;
                    case 3:
                        addStudentScore3();
                        break;
                    case 4:
                        addStudentScore4();
                        break;
                    case 5:
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

    public static void addSeriesScore1() {
        for (Student student : StudentManage.list.values()) {
            if (!student.flag1) {
                System.out.println("Nhập điểm của " + student.getName());
                float sc = Validate.validateScore("Nhập điểm: ");
                student.flag1 = true;
                student.setScore(sc, 0);
                StudentFile.saveList();
            }else {
                System.out.println("điểm của " + student.getName() + " đã được nhập");
            }
        }
    }

    public static void addSeriesScore2() {
        for (Student student : StudentManage.list.values()) {
            if (!student.flag2) {
                System.out.println("Nhập điểm của " + student.getName());
                float sc = Validate.validateScore("Nhập điểm: ");
                student.flag2 = true;
                student.setScore(sc, 1);
                StudentFile.saveList();
            }else {
                System.out.println("điểm của " + student.getName() + " đã được nhập");
            }
        }
    }

    public static void addSeriesScore3() {
        for (Student student : StudentManage.list.values()) {
            if (!student.flag3) {
                System.out.println("Nhập điểm của " + student.getName());
                float sc = Validate.validateScore("Nhập điểm: ");
                student.flag3 = true;
                student.setScore(sc, 2);
                StudentFile.saveList();
            }else {
                System.out.println("điểm của " + student.getName() + " đã được nhập");
            }
        }
    }

    public static void addSeriesScore4() {
        for (Student student : StudentManage.list.values()) {
            if (!student.flag4) {
                System.out.println("Nhập điểm của " + student.getName());
                float sc = Validate.validateScore("Nhập điểm: ");
                student.flag4 = true;
                student.setScore(sc, 3);
                StudentFile.saveList();
            }else {
                System.out.println("điểm của " + student.getName() + " đã được nhập");
            }
        }
    }

    public static void addSeriesScore() {
        int choice = -1;
        try {

            while (choice != 5) {
                Print.printMenuScore();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        addSeriesScore1();
                        break;
                    case 2:
                        addSeriesScore2();
                        break;
                    case 3:
                        addSeriesScore3();
                        break;
                    case 4:
                        addSeriesScore4();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Nhập sai, nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            addSeriesScore();
        }
    }

    public static void modifyStudentScore() {
        int choice = -1;
        try {

            while (choice != 5) {
                Print.printMenuScore();
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        modifyStudentScore1();
                        break;
                    case 2:
                        modifyStudentScore2();
                        break;
                    case 3:
                        modifyStudentScore3();
                        break;
                    case 4:
                        modifyStudentScore4();
                        break;
                    case 5:
                        break;
                    default:
                        System.out.println("Nhập sai, nhập lại");
                }
            }
        } catch (NumberFormatException e) {
            System.err.println("Nhập sai mời nhập lại");
            modifyStudentScore();
        }
    }
}
