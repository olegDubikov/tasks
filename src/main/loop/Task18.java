package main.loop;

import java.util.StringJoiner;

public class Task18 {

    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");

        for (int i = 10; i < 19; ++i) {
            if (i % 2 == 0 && i % 4 != 0) {
                String num = Integer.toString(i);
                joiner.add(num);
            } else if (i % 4 == 0) {
                joiner.add(i + "#");
            }
        }
        System.out.println("Начало");
        System.out.println(joiner);
        System.out.println("Конец");
    }

    public static void main(String[] args) {
        loop();
    }
}

/*
Вывести положительные четные двузначные числа с добавлением символа
Задание: Написать код, который выводит в консоль через пробел все
положительные четные двузначные числа до 19 в порядке возрастания.
Рядом с числом, которое делится на 4, нужно вывести символ "#".
Перед началом вывода нужно вывести слово "Начало" в отдельной строке,
а после окончания вывода чисел - слово "Конец", тоже в отдельной строке.

Примечание: в этом и последующем упражнении для сборки результирующей
строки с выводом значений через пробел нужно использовать StringJoiner.

Вывод должен получиться такой:
Начало

10 12# 14 16# 18

Конец
 */