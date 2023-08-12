package loop;

import java.math.BigInteger;
import java.util.StringJoiner;

public class Task161 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (var i = 11; i < 30; i++) {
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
}

/*
Вывести простые двузначные числа
Задание: написать код, который выводит в консоль через пробел все простые двузначные числа до 30.

Вывод должен получиться такой:

11 13 17 19 23 29
 */