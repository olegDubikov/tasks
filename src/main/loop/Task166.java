package main.loop;

import java.util.StringJoiner;

public class Task166 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        int x = 100;
        int y = 0;
        while (x <= 300) {
            for (var i = 1; i <= x; i += 2) {
                if (x % i == 0) {
                    y += i;
                }
            }
            if (y % 10 == 0) {
                joiner.add(String.valueOf(x));
            }
            x += 10;
            y = 0;
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}

/*
Вывести трехзначные числа согласно условию
Задание: написать код, который выводит в консоль через пробел все
положительные трехзначные числа до 300 (включая), для которых соблюдаются 2 условия:
само число заканчивается на 0 и сумма нечетных делителей этого числа тоже заканчивается на 0.

Вывод должен получиться такой:

190 270 290
 */