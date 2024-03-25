package main.loop;

import java.util.StringJoiner;

public class Task152 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        StringJoiner joiner1 = new StringJoiner(" ");
        StringJoiner joiner2 = new StringJoiner(" ");
        for (var i = 10; i <= 20; i++) {
            if (i % 2 == 0) {
                joiner.add(String.valueOf(i));
            }
            if (i % 3 == 0) {
                joiner1.add(String.valueOf(i));
            }
            if (i % 4 == 0) {
                joiner2.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
        System.out.println(joiner1);
        System.out.println(joiner2);
    }
}

/*
Вывести двузначные числа согласно условию
Задание: написать код, который построчно выводит в консоль
в первой строке все четные двузначные числа до 20 (включая),
во второй - двузначные числа до 20 (включая), делящиеся на 3 без остатка,
а в третьей - двузначные числа до 20 (включая), делящиеся на 4 без остатка.
Примечание: для сборки результирующих строк с выводом значений через пробел
нужно использовать StringJoiner.

Вывод должен получиться такой:
10 12 14 16 18 20

12 15 18

12 16 20
 */