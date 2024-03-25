package main.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] summary = new int[n];
        summary[0] = a;
        summary[1] = b;
        summary[2] = summary[0] + summary[1];
        for (var i = 3; i < n; i++) {
            summary[i] = summary[i - 1] * 2;
        }
        return summary;
    }
}

/*
Суммирования предыдущих значений
Даны целые числа n (> 2), a и b.
Сформировать и вывести целочисленный массив размера n,
первый элемент которого равен a, второй равен b,
а каждый последующий элемент равен сумме всех предыдущих.
 */
