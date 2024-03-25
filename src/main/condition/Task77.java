package main.condition;

import java.util.Arrays;
import java.util.HashSet;

public class Task77 {

    public static void diffNumAmount(int num) {
        String[] str = String.valueOf(num).split("");
        HashSet<String> s = new HashSet<>(Arrays.asList(str));
        switch (s.size()) {
            case 1 -> System.out.println(0);
            case 2 -> System.out.println(2);
            case 3 -> System.out.println(3);
            default -> System.out.println("");
        }
    }

    public static void main(String[] args) {
        diffNumAmount(223);
    }
}