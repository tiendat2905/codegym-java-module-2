import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String CLASS_NAME = "^[CAP]+\\d{4}[G-M]$";

    public ValidateClassName(){

    }

    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_NAME);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
