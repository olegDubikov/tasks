package loop;

import java.util.StringJoiner;

public class Task38 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (var i = 200; i < 224; i++) {
            if (i / 10 % 10 % 2 == 0 && i % 10 % 2 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.print(joiner);
    }
}

/*
Вывести трехзначные числа, составленные из четных цифр
Задание: Написать код, который выводит в консоль через пробел все целые трехзначные
числа от 200 до 223 (оба включительно), составленные целиком из четных цифр.

Вывод должен выглядеть так:

200 202 204 206 208 220 222
 */