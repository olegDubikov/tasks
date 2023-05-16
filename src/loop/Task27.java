package loop;

import java.util.StringJoiner;

public class Task27 {

    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int number = -num + 1;
        while (number < num) {
            joiner.add(String.valueOf(number));
            number++;
        }
        System.out.println(joiner);
    }
}

/*
Вывести числа от -Х до Х
Ниже представлен метод loop(int num), который принимает целое положительное число.

Задание: Написать код, который выводит в консоль через пробел все целые числа из
диапазона -num...num (не включая крайние значения диапазона).

Например, для числа 2 вывод будет:
-1 0 1
 */