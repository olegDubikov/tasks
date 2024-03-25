package main.loop;

import java.util.StringJoiner;

public class Task40 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (var i = 20; i < 40; i++) {
            if (i / 10 % 3 == 0 && i % 10 % 3 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}

/*
Вывести числа, в которых и цифра единиц, и цифра десятков делятся без остатка на три
Задание: Написать код, который выводит в консоль через пробел все целые числа от 20 до 40,
в которых и цифра единиц, и цифра десятков делятся без остатка на три

Вывод должен выглядеть так:

30 33 36 39
 */