package array;

import java.util.Arrays;

public class Task83 {
    public static int[] sumOfTwo(int[] numbers, int goal) {
        int x = 0;
        int[] arr = new int[2];
        while (x < numbers.length - 1) {
            for (var i = x + 1; i < numbers.length; i++) {
                if (goal - numbers[x] == numbers[i]) {
                    arr[0] = x;
                    arr[1] = i;
                    break;
                }
            }
            x++;
        }
        if (numbers.length <= 1
                || arr[0] == 0 && arr[1] == 0) {
            arr = null;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {9,5,7,3,1,2};
        System.out.println(Arrays.toString(sumOfTwo(arr, 20)));
    }
}

/*
Найти индексы двух элементов массива, сумма которых равна заданному значению
Метод sumOfTwo() принимает массив чисел numbers и целевое значение goal.

Задание: вернуть новый массив с индексами двух значений входящего массива,
сумма которых равна goal. Реализуйте задачу с линейной скоростью - O(n).
Лучшим вариантом будет решение в один проход по карте (все варианты описаны ниже).

Примечание: найденные индексы должны располагаться в порядке их нахождения в оригинальном массиве.
Подразумевается, что в каждом входящем массиве имеется либо только одно решение, либо решение отсутствует.

Например: есть массив [1, 2, 3], goal - 4. Вывод: [0, 2]
 */
