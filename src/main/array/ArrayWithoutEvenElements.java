package main.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int i = 0;
        for (var d : data) {
            if (d % 2 != 0) {
                data[i++] = d;
            }
        }
        return Arrays.copyOf(data, i);
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(changeData(data)));
    }
}