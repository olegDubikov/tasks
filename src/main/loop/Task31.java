package main.loop;

import java.util.StringJoiner;

public class Task31 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");

        for (int i = 10; i < 21; ++i) {
            if (i / 10 * (i % 10) < num) {
                joiner.add(Integer.toString(i));
            }
        }
        System.out.println(joiner);
    }
}

/*
Вывести двузначные числа, произведение цифр которых меньше входящего числа
Ниже представлен метод loop(int num), который принимает целое положительное число.

Задание: Написать код, который выводит в консоль через пробел все целые положительные
двузначные числа до 20 (включая), произведение цифр которых меньше входящего значения.

Например, для числа 5 вывод будет:

10 11 12 13 14 20
 */