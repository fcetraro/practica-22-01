package password;

public class PasswordSimple extends Password {
    public static final String strongRegex = "^(?=.*[a-z])(?=.*[A-Z]).{4,32}$";
    public PasswordSimple(){
        super(strongRegex);
    }
}
