package array;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        for (var i = 0; i < string.length; i++) {
            string[i] = Character.toUpperCase(string[i]);
        }
        return string;
    }
}
