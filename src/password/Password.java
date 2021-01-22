package password;

import password.Exception.PasswordException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    private String regex;
    private String value;
    public Password(String regex){
        this.regex = regex;
    }
    public boolean isPasswordValid(String password){
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(password);

        if(matcher.matches())
            return true;
        else
            return false;

    }
    public void setValue(String password) throws PasswordException {
        if(isPasswordValid(password)){
            this.value=password;
            System.out.println("Password setted successfully!");
        } else {
            throw new PasswordException("Invalid password!");
        }
    }
}
