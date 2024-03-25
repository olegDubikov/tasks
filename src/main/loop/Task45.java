package main.loop;

import java.util.StringJoiner;

public class Task45 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (var i = 100 + num; i <= 500; i++) {
            boolean b = i % 100 == num;
            if (b) {
                joiner.add(String.valueOf(i));
                i += 99;
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(23);
    }
}

/*
Вывести трехзначные числа в определенном виде
Ниже представлен метод loop(int num), который принимает целое положительное двузначное число.
Задание: Написать код, который выводит в консоль через пробел все целые трехзначные числа от 100 до 500,
в которых входящее двузначное число является "внутренней" частью.

Например, для числа 23 вывод будет:

123 223 323 423
 */