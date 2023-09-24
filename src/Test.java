import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Я учусь на Job4j");
        String text = "Я учусь на Job4j";
        Matcher matcher = pattern.matcher(text);
    }
}
