package main.loop;

import java.util.StringJoiner;

public class Task151 {
    public static void loop() {
        for (int i = 1; i <= 9; i++) {
            StringJoiner joiner = new StringJoiner(" ");
            for (int j = 1; j <= 9; j++) {
                joiner.add(String.valueOf(i * j));
            }
            System.out.println(joiner);
        }
    }
}

/*
Таблица умножения
Задание: написать код, который построчно выводит в консоль таблицу умножения.
В первой строке - умножение 1-9 на 1, во второй - на 2 и т.д. до умножения 1-9 на 9.
 */