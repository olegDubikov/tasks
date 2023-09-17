package loop;

import java.util.StringJoiner;

public class Task42 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 20; i <= 30; i++) {
            if (i / 10 % 3 != i % 10 % 3) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}

/*
Написать код, который выводит в консоль через пробел все целые числа от 20 до 30 (оба включая),
в которых и цифра единиц, и цифра десятков делятся на 3 с разным остатком.
 */
