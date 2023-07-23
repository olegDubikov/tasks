package loop;

import java.util.StringJoiner;

public class Task163 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (var i = 10; i <= 20; i++) {
            int sum = 0;
            for (var j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum % 2 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}

/*
Вывести двузначные числа, сумма делителей которых тоже является четным числом
Задание: написать код, который выводит в консоль через пробел
все числа от 10 до 20 (оба включая), сумма делителей которых тоже является четным числом.

Вывод должен получиться такой:

10 11 12 13 14 15 17 19 20
 */
