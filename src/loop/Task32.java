package loop;

import java.util.StringJoiner;

public class Task32 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 50; i >= 10; --i) {
            if (i % 10 == 7) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}

/*
Вывести положительные двузначные числа, заканчивающиеся на цифру 7 (по убыванию)
Задание: Написать код, который выводит в консоль через пробел все целые положительные
двузначные числа до 50, заканчивающиеся на цифру 7 (по убыванию).

Вывод должен быть:

47 37 27 17
 */