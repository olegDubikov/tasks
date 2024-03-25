package main.loop;

import java.util.StringJoiner;

public class Task21 {

    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");

        for (int i = 38; i > 9; --i) {
            if (i % 5 == 0) {
                joiner.add(Integer.toString(i));
            }
        }
        System.out.println("Старт");
        System.out.println(joiner);
        System.out.println("Финиш");
    }

    public static void main(String[] args) {
        loop();
    }
}

/*
Вывести в порядке убывания положительные двузначные числа, делящиеся на 5 без остатка
Задание: Написать код, который выводит в консоль через пробел в порядке убывания все
положительные двузначные числа до 38, делящиеся на 5 без остатка.
Перед началом вывода нужно вывести слово "Старт" в отдельной строке,
а после окончания вывода чисел - слово "Финиш", тоже в отдельной строке.

Вывод должен получиться такой:
Старт

35 30 25 20 15 10
 */