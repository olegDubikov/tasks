package main.loop;

import java.util.StringJoiner;

public class Task36 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (var i = 1; i < 3; i++) {
            for (var j = 0; j < 10; j++) {
                var x = i * j;
                if (x > 9 && x < 19) {
                    joiner.add(i + "" + j);
                }
            }
        }
        System.out.println(joiner);
    }
}

/*
36. Вывести двузначные числа, произведение которых является двузначным числом
Задание: Написать код, который выводит в консоль через пробел все положительные
двузначные числа до 30, произведение которых тоже является двузначным числом.

Вывод должен выглядеть так:

25 26 27 28 29
 */