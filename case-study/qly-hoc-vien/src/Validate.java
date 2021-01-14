
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    static Scanner scanner = new Scanner(System.in);
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    static Pattern namePattern = Pattern.compile("^[\\pL\\pZ]{0,40}$");

    static {
        simpleDateFormat.setLenient(false);
    }

    public static String validateName(String mess) {
        System.out.println(mess);
        try {
            String name = scanner.nextLine().trim().replaceAll("\\s+", " ");
            if (!namePattern.matcher(name).matches())
                throw new Exception("invalid name");
            String[] words = name.split(" ");
            StringBuilder result = new StringBuilder();
            for (String word : words) {
                result.append(word.substring(0, 1).toUpperCase())
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
            return result.toString().trim();
        } catch (Exception e) {
            System.err.println("Trong tên phải là kí tự chữ và không quá dài");
            return validateName(mess);
        }
    }

    public static int validateNumber(String mess) {
        System.out.println(mess);
        try {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 0) {
                System.out.println("Nhập số dương");
                return validateNumber(mess);
            }
            return number;
        } catch (NumberFormatException e) {
            System.out.println("nhập là 1 số dương");
            return validateNumber(mess);
        }
    }

    public static float validateScore(String mess) {
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
                return validateScore(mess);
            }
        }
    }

    public static String deleteSpace() {
        String newName = scanner.nextLine();
        return newName.replaceAll("\\s+", "").trim();
    }

    public static String validateSex(String mess) {
        System.out.println(mess);
        String newSex = deleteSpace();
        while (newSex.length() == 0 || newSex != null) {
            if (newSex.equals("Nam") || newSex.equals("Nu") || newSex.equals("nam") || newSex.equals("nu"))
                break;
            System.out.println("bạn nhập sai giới tính:");
            System.out.println("nhập lại:");
            newSex = deleteSpace();
        }
        Student student = new Student();
        return student.setSex(newSex);
    }

    public static Date validateDate(String value) {
        try {
            checkYear(value);
            return simpleDateFormat.parse(value);
        } catch (Exception e) {
            System.err.println("Không hợp lệ!! " + e.getMessage());
            return null;
        }
    }

    public static void checkYear(String date) throws Exception {
        String[] a = date.split("/");
        int year = Integer.parseInt(a[2]);
        if (year <= 1930 || year >= 2020) {
            throw new Exception("Năm sinh không hợp lệ");
        }
    }
}
