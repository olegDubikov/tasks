package loop;

import java.util.StringJoiner;

public class Task164 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (var i = 10; Math.pow(i, 2) <= 300; i++) {
            joiner.add(String.valueOf(i));
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}

/*
Вывести двузначные числа, квадрат которых не превышает 300
Задание: написать код, который выводит в консоль через пробел
все положительные двузначные числа, квадрат которых не превышает 300.

Вывод должен получиться такой:

10 11 12 13 14 15 16 17
 */
