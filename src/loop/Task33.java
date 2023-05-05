package loop;

import java.util.StringJoiner;

public class Task33 {

    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");

        for (int i = 100; i <= 160; ++i) {
            if (i % 11 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}

/*
Вывести положительные трехзначные числа, делящиеся без остатка на 11 (по возрастанию)
Задание: Написать код, который выводит в консоль через пробел все целые положительные
трехзначные числа до 160, делящиеся без остатка на 11 (по возрастанию).

Вывод должен быть:

110 121 132 143 154
 */