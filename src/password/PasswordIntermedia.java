package password;

public class PasswordIntermedia extends Password {
    public static final String strongRegex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{4,32}$";
    public PasswordIntermedia(){
        super(strongRegex);
    }
}
