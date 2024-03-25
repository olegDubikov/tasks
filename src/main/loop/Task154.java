package main.loop;

import java.util.StringJoiner;

public class Task154 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        for (var i = 10; i <= 20; i++){
            for (var j = 1; j < i; j++) {
                if(i % j == 0) {
                    joiner.add(String.valueOf(j));
                }
            }
            System.out.printf("Число: %s, делители: %s%n", i, joiner);
            joiner = new StringJoiner(" ");
        }
    }
}

/*
Вывести делители каждого числа от 10 до 20
Задание: написать код, который выводит в консоль построчно через пробел
все делители чисел от 10 до 20 (оба включая) в виде "Число: х, делители: у1 у2 ... уN".
 */