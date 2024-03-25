package main.loop;

import java.util.StringJoiner;

public class Task29 {

    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");

        for(int i = 100; i <= 150; ++i) {
            if (sumNum(i) == num) {
                joiner.add(String.valueOf(i));
            }
        }

        System.out.println(joiner);
    }

    public static int sumNum(int num) {
        int num1 = num / 100;
        int num2 = num / 10 % 10;
        int num3 = num % 10;
        return num1 + num2 + num3;
    }
}

/*
Вывести целые положительные трехзначные числа с условием
Ниже представлен метод loop(int num), который принимает целое положительное число.

Задание: Написать код, который выводит в консоль через пробел все целые положительные
трехзначные числа до 150, сумма цифр которых равна входящему значению.

Например, для числа 5 вывод будет:
104 113 122 131 140
 */