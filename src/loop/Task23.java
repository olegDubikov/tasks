package loop;

import java.util.StringJoiner;

public class Task23 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for(int i = num + 1; i < num + 6; i++) {
            joiner.add(Integer.toString(i));
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(10);
    }
}

/*
Вывести ряд чисел с последующим увеличением
Ниже представлен метод loop(int num), который принимает целое положительное число.

Задание: Написать код, который выводит в консоль через пробел 5 чисел, отвечающих следующим условиям:

- Серия начинается с числа, которое больше входящего на 1.
- Каждое число в серии (начиная со второго) больше предыдущего на 1.

Например, для числа 10 вывод будет:
11 12 13 14 15
 */