package string;

import java.util.Arrays;

public class Task1 {

    public static String maxMatch(String[] strings) {
        String rsl = minWord(strings);
        int x = rsl.length();
        int i = 0;

        while (x > 0 && i < strings.length) {
            if (rsl.substring(0, x).equals(strings[i].substring(0, x))) {
                ++i;
            } else {
                --x;
            }
        }
        return rsl.substring(0, x);
    }

    public static String minWord(String[] strings) {
        String min = Arrays.toString(strings);
        min = min.replace("[]", "");

        for (int i = 0; i < strings.length; ++i) {
            if (strings[i].length() < min.length()) {
                min = strings[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println(maxMatch(new String[0]));
    }
}