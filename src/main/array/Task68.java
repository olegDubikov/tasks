package main.array;

import java.util.StringJoiner;

public class Task68 {
    public static void array(int[] arr) {
        StringJoiner joinNames = new StringJoiner(" ");
        int[] var2 = arr;
        int var3 = arr.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            int j = var2[var4];
            String str = Integer.toString(j);
            joinNames.add(str);
        }

        System.out.println(joinNames);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 3};
        array(arr);
    }
}