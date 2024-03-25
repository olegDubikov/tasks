package main.loop;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task37 {
    public static void loop() {
        String result = IntStream.rangeClosed(100, 130)
                .filter(i -> (i / 100) * (i % 10) == Math.pow(i / 10 % 10, 2))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}

/*
37. Вывести трехзначные числа по определенному условию
Задание: Написать код, который выводит в консоль через пробел все целые
положительные трехзначные числа до 130, соответствующие следующему требованию:
произведение первой и последней цифр равно квадрату средней.

Вывод должен выглядеть так:

100 111 124
 */