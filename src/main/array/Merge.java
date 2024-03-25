package main.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int i = 1;
        int j = 0;
        int[] rsl;
        rsl = IntStream.concat(IntStream.of(left), IntStream.of(right))
                .toArray();
        while (i < rsl.length) {
            int temp = rsl[j];
            if (temp >= rsl[i]) {
                rsl[j] = rsl[i];
                rsl[i] = temp;
            }
            i++;
            if (i == rsl.length) {
                j++;
                i = j + 1;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int[] a = {0};
        int[] b = {0};
        System.out.println(Arrays.toString(merge(a, b)));
    }
}

/*
Даны два отсортированных по возрастанию массива. 
Как без сортировки Array.sort() их объединить в третий массив?
 */