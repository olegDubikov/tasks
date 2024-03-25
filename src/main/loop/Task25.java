package main.loop;

import java.util.StringJoiner;

public class Task25 {

    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");

        for (int a = 7; num > 0; --num) {
            joiner.add(Integer.toString(a));
            a += 4;
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(5);
    }
}

/*
Вывести числа в арифметической прогрессии по возрастанию
Ниже представлен метод loop(int num), который принимает целое положительное число -
количество членов арифметической прогрессии.

Пусть первый член прогрессии равен 7, а разница между соседними членами
прогрессии равна 4 (в возрастающем порядке).

Задание: Написать код, который выводит в консоль через пробел члены прогрессии
в количестве равном входящему числу.

Примечание: для сборки результирующей строки с выводом значений через
пробел нужно использовать StringJoiner.

Например, для числа 5 вывод будет:
7 11 15 19 23
 */