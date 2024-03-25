package main.loop;

import java.util.StringJoiner;

public class Task157 {
    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");
        int num = 2;
        int sum = 0;
        while (num <= 10000) {
            for (var i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            if (sum == num) {
                joiner.add(String.valueOf(num));
            }
            sum = 0;
            num++;
        }
        System.out.println("1 " + joiner);
    }

    public static void main(String[] args) {
        loop();
    }
}

/*
Вывести числа, у которых сумма делителей равна самому числу
Задание: Написать код, который выводит в консоль через пробел все числа до 10000,
у которых сумма делителей (включая 1, но не включая само число) равна самому числу.

Вывод должен быть такой:

1 6 28 496 8128
 */