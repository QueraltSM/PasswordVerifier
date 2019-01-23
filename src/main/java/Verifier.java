import java.util.regex.Pattern;

public class Verifier {
    public static int passwordOk;

    public Verifier(){
        passwordOk = 0;
    }

    public static boolean verify(String password){
        if (password != null) passwordOk++;
        if (password.length() >= 8) passwordOk++;
        if (Pattern.compile("[A-Z]+").matcher(password).find()) passwordOk++;
        if (Pattern.compile("[a-z]+").matcher(password).find()) passwordOk++;
        else return false;
        if (Pattern.compile("\\d+").matcher(password).find()) passwordOk++;
        return passwordOk >= 3;
    }
}