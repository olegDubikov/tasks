package main.array;

import java.util.Arrays;

public class Task82 {
    public static int[] array(int[] nums) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (var n : nums) {
            if (n > 0) {
                positive += n;
            }
            if (n < 0) {
                negative += n;
            }
            if (n == 0) {
                zero++;
            }
        }
        return new int[]{positive, negative, zero};
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3};
        System.out.println(Arrays.toString(array(arr)));
    }
}

/*
Найти суммы отрицательных, положительных чисел и нулей в массиве
Ниже представлен метод array(int[] arr), который принимает массив целых чисел.

Задание: метод array должен возвращать массив, который содержит информацию о сумме
положительных значений во входящем массиве, сумме отрицательных значений,
а также количестве нулей (в том же порядке).

Например, для массива значений [5, -3, -4, 0, 3, 1] нужно вернуть массив [9, -7, 1].
 */