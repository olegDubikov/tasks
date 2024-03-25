package main.array;

import java.util.StringJoiner;

public class Task74 {
    public static void array(int[] arr) {
        StringJoiner joiner = new StringJoiner(" ");
        StringJoiner joiner1 = new StringJoiner(" ");
        for (var i = 0; i < arr.length / 2; i++) {
            joiner.add(String.valueOf(arr[i]));
            joiner1.add(String.valueOf(arr[arr.length - 1 - i]));
        }
        if (arr.length % 2 != 0) {
            joiner1.add(String.valueOf(arr[arr.length / 2]));
        }
        System.out.println(joiner);
        System.out.println(joiner1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        array(arr);
    }
}

/*
Вывести первую половину массива с начала, а вторую - с конца
Ниже представлен метод array(int[] arr), который принимает массив целых чисел.

Задание: написать код, который выводит в консоль через пробел все значения массива таким образом:
в первой строке выводятся значения из первой половины массива,
начиная с начала, а во второй строке - из второй половины массива,
начиная с конца. Если в массиве нечетное число ячеек, то центральная ячейка должна быть на второй строке.

Например, для массива значений [1, 2, 3, 4, 5] вывод должен быть:

1 2

5 4 3
 */