package array;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
        int sum = 0;
        for (var d : data) {
            sum += d;
        }
        return sum % 2 == 0;
    }
}

/*
Сумма элементов массива - четное число?
Метод принимает массив целочисленных значений.
Метод должен определить сумму всех элементов в массиве,
проверить значение суммы является ли оно четным числом.
 */