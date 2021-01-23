package password;

import password.exception.PasswordException;

import java.util.regex.Pattern;

public class Password {
    private String regex;
    private String value;
    public Password(String regex){
        this.regex = regex;
    }
    public boolean isPasswordValid(String password){
        if(Pattern.matches(this.regex, password))  return true;
        else return false;
    }
    public void setValue(String password) throws PasswordException {
        if(isPasswordValid(password)){
            this.value=password;
            System.out.println("Password validated successfully!");
        } else {
            // Considero que podria ser adecuado utilizar excepciones para identificar passwords incorrectos.
            // Idealmente podria exisitir diferentes excepciones para cada tipo de restriccion que no pase el password
            // Ejemplo, password muy corto; no hay caracter "especial"; etc...
            throw new PasswordException("Invalid password!");
        }
    }
}
