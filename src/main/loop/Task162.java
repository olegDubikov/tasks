package main.loop;

import java.math.BigInteger;
import java.util.StringJoiner;

public class Task162 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (var i = 101; i <= 150; i++) {
            if (check(i)) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    private static boolean check(int a) {
        return new BigInteger(BigInteger.valueOf(a)
                .toByteArray())
                .isProbablePrime((int) Math.log(a));
    }

    public static void main(String[] args) {
        loop();
    }
}

/*
Вывести простые трехзначные числа
Задание: написать код, который выводит в консоль через пробел все простые трехзначные числа до 150.

Вывод должен получиться такой:

101 103 107 109 113 127 131 137 139 149
 */
