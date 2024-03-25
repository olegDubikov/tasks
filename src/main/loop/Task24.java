package main.loop;

import java.util.StringJoiner;

public class Task24 {

    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        int a = 5;
        for(int i = num - 10; a-- > 0; i -= 6) {
            joiner.add(Integer.toString(i));
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(0);
    }
}

/*
Вывести ряд чисел с последующим уменьшением
Ниже представлен метод loop(int num), который принимает целое число.

Задание: Написать код, который выводит в консоль через пробел 5 чисел, отвечающих следующим условиям:
- Серия начинается с числа, которое меньше входящего на 10.
- Каждое число в серии (начиная со второго) меньше предыдущего на 6.

Например, для числа 50 вывод будет:
40 34 28 22 16
 */