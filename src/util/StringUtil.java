package util;

public class StringUtil {
    public static String rpad(String s, char c, int n){
        for (int i = 0; i < n; i++) {
            s = s+c;
        }
        return s;
    }
    public static String ltrim(String s){
        int i = 0;
        while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
            i++;
        }
        return s.substring(i);
    }
    public static String rtrim(String s){
        int i = s.length()-1;
        while (i >= 0 && Character.isWhitespace(s.charAt(i))) {
            i--;
        }
        return s.substring(0,i+1);
    }
    public static int indexOfN(String s, char c, int n){
        int occurrencesOfChar=0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==c){
                occurrencesOfChar++;
                if(occurrencesOfChar==n){
                    return i;
                }
            }
        }
        return -1;
    }
}
