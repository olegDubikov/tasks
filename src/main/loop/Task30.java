package main.loop;

import java.util.StringJoiner;

public class Task30 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 100; i <= 130; ++i) {
            if (i % 10 == num % 10) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}

/*
Вывести трехзначные числа по определенному условию
Ниже представлен метод loop(int num), который принимает целое положительное число.

Задание: Написать код, который выводит в консоль через пробел все целые положительные
трехзначные числа до 130, в которых последняя цифра такая же, как и во входящем числе.

Например, для числа 34 вывод будет:

104 114 124
 */