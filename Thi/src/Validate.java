import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Validate {
    static Scanner scanner = new Scanner(System.in);
     static final SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    static Pattern namePattern = Pattern.compile("^[\\pL\\pZ]{0,40}$");
    static Pattern PHONE_NUMBER_PATTERN = Pattern.compile("^\\d{7,12}$");
    static Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
    static final Pattern TEXT_PATTERN = Pattern.compile("^[\\pL\\d., /-]+$");
    static final String EMPTY_STRING = "";
    static final String DATE_SEPARATOR = "/";

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
        String phone = scanner.nextLine();
        boolean result = PHONE_NUMBER_PATTERN.matcher(phone).matches();
        if (!result) {
            System.out.printf("Không đúng định dạng ", phone);
            return null;
        }

        for (User user : UserManage.userList) {
            if (user.getPhoneNumber().equals(phone)) {
                System.out.printf("Không đúng định dạng ", phone);
                return null;
            }
        }
        return phone;
    }

    public static String parseDayOfBirth(String dayOfBirth) throws ParseException {
        String formattedDobString = formatDateString(dayOfBirth);

        Date parsedDob = format.parse(formattedDobString);
        if (parsedDob == null)
            throw new RuntimeException("Ngay sinh khong hop le: " + dayOfBirth);
        checkAge(formattedDobString);
        return formattedDobString;
    }

    public static String formatDateString(String date) {
        return Stream.of(date.split(DATE_SEPARATOR))
                .map(num -> num.length() == 1 ? "0" + num : num)
                .collect(Collectors.joining(DATE_SEPARATOR));
    }

    public static void checkAge(String dob) {
        String yearStr = dob.substring(dob.lastIndexOf("/") + 1);
        int years = Integer.parseInt(yearStr);
        int age = LocalDate.now().getYear() - years;
        if (age > 120 || age < 1)
            throw new RuntimeException("Do tuoi khong hop le");
    }

    public static String validateDayOfBirth() {
        System.out.println("Nhap ngay sinh (dd/MM/yyyy):");
        while (true) {
            try {
                String input = parseDayOfBirth(getDefaultString());
                if (input == null)
                    throw new RuntimeException("Ngay sinh khong hop le");
                return input;
            } catch (Exception e) {
                System.out.println(e.getMessage() + ". Nhap lai:");
            }
        }
    }

    public static String getDefaultString() {
        while (true) {
            String input = removeWhitespaceOfInput(scanner.nextLine());
            if (input.length() == 0)
                System.out.println("Khong duoc de trong. Vui long nhap lai:");
            else
                return input;
        }
    }

    public static String removeWhitespaceOfInput(String input) {
        return input.trim().replaceAll("\\s+", " ");
    }


    public static boolean isEmailValid(String regex) {
        return EMAIL_REGEX.matcher(regex).matches();
    }

    public static void checkText(String address) {
        if (!testStringWithPattern(address, TEXT_PATTERN))
            throw new RuntimeException("Khong hop le: " + address);
    }

    private static boolean testStringWithPattern(String string, Pattern pattern) {
        boolean isStringEmpty = string.length() == 0;
        if (isStringEmpty) return false;
        return pattern.matcher(string).matches();
    }

    public static String validateAddress() {
        while (true) {
            try {
                System.out.println("Nhap dia chi:");
                String input = getFormattedString();
                checkText(input);
                return input;
            } catch (RuntimeException e) {
                System.out.println(e.getMessage() + ". Nhap lai:");
            }
        }
    }

    public static String getFormattedString() {
        while (true) {
            String input = formatStringInput(scanner.nextLine());
            if (input.length() == 0)
                System.out.println("Khong duoc de trong. Vui long nhap lai:");
            else
                return input;
        }
    }

    public static String formatStringInput(String input) {
        String removeWhitespace = input.trim().replaceAll("\\s+", " ");
        if (removeWhitespace.equals(EMPTY_STRING)) return EMPTY_STRING;

        String[] words = removeWhitespace.split(" ");
        return Stream.of(words)
                .map(upperCaseFirstLetter)
                .collect(Collectors.joining(" "));
    }

    public static final Function<String, String> upperCaseFirstLetter = word ->
            word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();


}
