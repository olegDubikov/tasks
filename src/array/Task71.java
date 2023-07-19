package array;

import java.util.StringJoiner;

public class Task71 {
    public static void array(int[] arr) {
        StringJoiner joiner = new StringJoiner(" ");
        StringJoiner joiner1 = new StringJoiner(" ");
        for (var i = 0; i < arr.length; i++) {
            if ((i + 1) % 2 != 0) {
                joiner.add(String.valueOf(arr[i]));
            } else {
                joiner1.add(String.valueOf(arr[i]));
            }
        }
        System.out.println(joiner);
        System.out.println(joiner1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 0, 3};
        array(arr);
    }
}
