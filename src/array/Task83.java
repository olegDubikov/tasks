package array;

import java.util.Arrays;

public class Task83 {
    public static int[] sumOfTwo(int[] numbers, int goal) {
        int i = 0;
        int j = 0;
        int[] arr = null;
        while (j < numbers.length - 1) {
            if (goal - numbers[j] == numbers[i]) {
                arr = new int[] {j, i};
                break;
            }
            if (i == numbers.length - 1) {
                i = j + 1;
                j++;
            }
            i++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(Arrays.toString(sumOfTwo(arr, 7)));
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
