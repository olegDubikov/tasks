package loop;

import java.util.StringJoiner;

public class Task47 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (var i = 1345; i <= 1445; i++) {
            int x = i / 100;
            int y = i % 100;
            if ((x / 10 + x % 10) == (y / 10 + y % 10)) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}

/*
Вывести четырехзначные числа с определенным условием
Задание: Написать код, который выводит в консоль через
пробел все целые числа от 1345 до 1445, в которых и
сумма первых двух цифр, и сумма последних двух цифр равна 5.

Вывод должен быть такой:

1405 1414 1423 1432 1441
 */