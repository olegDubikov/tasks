package main.array;

public class Fibonacci {
    public static boolean checkArray(int[] data) {
        boolean rsl = true;
        for (var i = 2; i < data.length; i++) {
            if (data[i] != data[i - 1] + data[i - 2]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}

/*
Числа Фибоначчи.
Вам необходимо реализовать метод, который проверит является ли последовательность
целочисленных значений, которая находится во входящем массиве,
последовательностью чисел Фибоначчи.
Метод должен вернуть true, если последовательность чисел - числа Фибоначчи.
 */