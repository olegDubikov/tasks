package array;

import java.util.StringJoiner;

public class Task70 {
    public static void array(int[] arr) {
        StringJoiner joiner = new StringJoiner(" ");
        StringJoiner joiner1 = new StringJoiner(" ");
        for (var i = 0; i < arr.length; i++) {
            if (arr.length % 2 != 0) {
                if (i <= arr.length / 2) {
                    joiner.add(String.valueOf(arr[i]));
                } else {
                    joiner1.add(String.valueOf(arr[i]));
                }
            }
            if (arr.length % 2 == 0) {
                if (i < arr.length / 2) {
                    joiner.add(String.valueOf(arr[i]));
                } else {
                    joiner1.add(String.valueOf(arr[i]));
                }
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
