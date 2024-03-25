package main.loop;

import java.util.StringJoiner;

public class Task34 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int count = 5;

        while(count != 0) {
            ++num;
            if (num % 2 == 1) {
                joiner.add(String.valueOf(num));
                --count;
            }
        }

        System.out.println(joiner);
    }
}

/*
Вывести нечетные числа
Ниже представлен метод loop(int num), который принимает целое положительное число.

Задание: Написать код, который выводит в консоль через пробел 5 последующих входящему числу нечетных чисел.
Например, для числа 6 вывод будет:
7 9 11 13 15
 */