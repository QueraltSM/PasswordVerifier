import java.util.regex.Pattern;

public class Verifier {

    public static boolean verify(String password){
        if ( password == null || password.length() < 8) return false;
        return Pattern.compile("[A-Z]+").matcher(password).find() &&
                Pattern.compile("[a-z]+").matcher(password).find() &&
                Pattern.compile("\\d+").matcher(password).find();
    }
}