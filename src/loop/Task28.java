package loop;

import java.util.StringJoiner;

public class Task28 {

    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");

        for (int i = 10; i < 31; ++i) {
            if (i / 10 + i % 10 == num) {
                joiner.add(Integer.toString(i));
            }
        }

        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(1);
    }
}

/*
Вывести целые положительные двузначные числа с условием
Ниже представлен метод loop(int num), который принимает целое положительное число.

Задание: Написать код, который выводит в консоль через пробел все целые положительные
двузначные числа до 30, сумма цифр которых равна входящему значению.

Например, для числа 6 вывод будет:
15 24
 */