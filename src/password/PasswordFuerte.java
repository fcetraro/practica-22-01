package password;

import password.exception.PasswordException;

import java.util.regex.Pattern;

public class PasswordFuerte extends Password {
    public static final String strongRegex = "^(?i)(?=.*[a-z])(?=.*[0-9])[a-z0-9#.!@$*&_]{5,34}$";
    public PasswordFuerte(){
        super(strongRegex);
    }
}
