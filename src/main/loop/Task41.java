package main.loop;

import java.util.StringJoiner;

public class Task41 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (var i = 20; i <= 35; i++) {
            if (i / 10 % 3 == i % 10 % 3){
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}

/*
Вывести числа, в которых цифры единиц и десятков делятся на 3 с одинаковым остатком
Задание: Написать код, который выводит в консоль через пробел
все целые числа от 20 до 35 (оба включая),
в которых и цифра единиц, и цифра десятков делятся на 3 с одинаковым остатком.

Вывод должен выглядеть так:

22 25 28 30 33
 */