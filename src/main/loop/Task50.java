package main.loop;

import java.util.StringJoiner;

public class Task50 {
    public static void loop(int n) {
        StringJoiner joiner = new StringJoiner(" ");
        int sum = 1;
        for (var i = 0; i < 5; i++) {
            joiner.add(String.valueOf(sum));
            sum += n;
        }
        System.out.println(joiner);
    }
}

/*
Вывести серию чисел с определенным условием
Ниже представлен метод loop(int n), который принимает целое положительное число - n.

Задание: Написать код, который выводит в консоль через пробел серию из 5 чисел, начиная с 1 так,
чтобы каждое следующее число в серии было на n больше предыдущего.

Например, для числа 3 вывод будет:
1 4 7 10 13
 */