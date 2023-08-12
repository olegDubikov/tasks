package loop;

import java.util.StringJoiner;

public class Task39 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (var i = 200; i <= 210; i++) {
            int j = i / 100 + i / 10 % 10 + i % 10;
            if (i % j == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}

/*
Вывести числа, делящиеся без остатка на сумму своих цифр
Задание: Написать код, который выводит в консоль через пробел все целые числа
от 200 до 210 (оба включительно), которые делятся без остатка на сумму собственных цифр.

Вывод должен выглядеть так:

200 201 204 207 209 210
 */