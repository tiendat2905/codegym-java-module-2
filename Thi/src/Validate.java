import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Validate {
    static Scanner scanner = new Scanner(System.in);
    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
    static Pattern namePattern = Pattern.compile("^[\\pL\\pZ]{0,40}$");
    static Pattern phonePattern = Pattern.compile("\\(?\\+[0-9]{1,3}\\)? ?-?[0-9]{1,3} ?-?[0-9]{3,5} ?-?[0-9]{4}( ?-?[0-9]{3})? ?(\\w{1,10}\\s?\\d{1,6})?");

    public static String validateName(String mess) {
        System.out.println(mess);
        try {
            String name = scanner.nextLine().trim().replaceAll("\\s+", " ");
            if (!namePattern.matcher(name).matches())
                throw new Exception("invalid name");
            String[] word = name.split(" ");
            StringBuilder result = new StringBuilder();
            for (String s : word) {
                result.append(s.substring(0, 1).toUpperCase()).append(s.substring(1)).append(" ");
            }
            return result.toString().trim();
        } catch (Exception e) {
            System.err.println("Trong tên phải là kí tự chữ và không quá dài");
            return validateName(mess);
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
        User user = new User();
        return user.setSex(newSex);
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

    public static String validatePhoneNumber(String mess){
        System.out.println(mess);
        for (User str : UserManage.userList) {
            if (phonePattern.matcher((CharSequence) str).matches()) {
                System.out.printf("%s is valid%n", str);
            } else {
                System.out.printf("%s is not valid%n", str);
            }
        }
        return null;
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
        if (year <= 1930 || year >= 2021) {
            throw new Exception("Năm sinh không hợp lệ");
        }
    }

    public static boolean isEmailValid(String regex) {
        final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
        return EMAIL_REGEX.matcher(regex).matches();
    }

}
