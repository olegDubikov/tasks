package array;

import java.util.StringJoiner;

public class Task72 {
    public static void array(int[] arr) {
        StringJoiner joiner = new StringJoiner(" ");
        StringJoiner joiner1 = new StringJoiner(" ");
        for (int i : arr) {
            if (i % 2 == 0) {
                joiner.add(String.valueOf(i));
            } else {
                joiner1.add(String.valueOf(i));
            }
        }
        if (joiner.length() != 0) System.out.println(joiner);
        if (joiner1.length() != 0) System.out.println(joiner1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 0, 3};
        array(arr);
    }
}
