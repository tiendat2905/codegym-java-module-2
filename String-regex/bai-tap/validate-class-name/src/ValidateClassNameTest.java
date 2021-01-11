public class ValidateClassNameTest {
    private static ValidateClassName validateClassName;

    public static final String[] validClass = new String[]{"C0318G"};
    public static final String[] invalidClass = new String[]{"M0318G" , "P0323A"};

    public static void main(String[] args) {
        validateClassName = new ValidateClassName();
        for (String className: validClass){
            boolean isvalid = validateClassName.validate(className);
            System.out.println("ClassName is " + className + " is valid: " + isvalid);
        }
        for (String className: invalidClass){
            boolean isvalid = validateClassName.validate(className);
            System.out.println("ClassName is " + className + " is valid: " + isvalid);
        }
    }

}
