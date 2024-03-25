package main.type;

public class StringTest {

    public static void main(String[] args) {
        String s = "Privet.";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < 100; ++i) {
            sb.append("!");
            s = s + "!";
        }
        System.out.println(sb);
        System.out.println(s);
    }
}