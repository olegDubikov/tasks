package array;

import java.util.StringJoiner;

public class Task73 {
    public static void array(int[] arr) {
        StringJoiner joiner = new StringJoiner("");
        for (var i = 0; i < arr.length / 2; i++) {
            joiner.add(arr[i] + " " + arr[arr.length - 1 - i] + "\n");
        }
        if (arr.length % 2 != 0) {
            joiner.add(arr[arr.length / 2] + "\n");
        }
        System.out.print(joiner);
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 0, 3};
        array(arr);
    }
}

/*
Вывести симметричные ячейки массива
Ниже представлен метод array(int[] arr), который принимает массив целых чисел.
Задание: написать код, который выводит в консоль через пробел все значения
массива таким образом: в каждой строке выводятся значения из двух ячеек,
симметрично расположенных по отношению к середине массива.
Если массив имеет нечетный размер, то центральную ячейку нужно вывести в отдельной строке.

Например, для массива значений [5, 2, 6, 0, 3] вывод должен быть:

5 3

2 0

6
 */