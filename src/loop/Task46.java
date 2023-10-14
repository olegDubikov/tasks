package loop;

import java.util.StringJoiner;
import java.util.stream.IntStream;

public class Task46 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        IntStream.rangeClosed(1000, 1500).filter(i -> i / 10 % 100 == num)
                .mapToObj(String::valueOf).forEach(joiner::add);
        System.out.println(joiner);
    }
}

/*
Вывести четырехзначные числа в определенном виде
Ниже представлен метод loop(int num), который принимает целое положительное двузначное число.

Задание: Написать код, который выводит в консоль через пробел все целые четырехзначные числа
от 1000 до 1500, в которых входящее двузначное число является средней "внутренней" частью.

Например, для числа 23 вывод будет:

1230 1231 1232 1233 1234 1235 1236 1237 1238 1239
 */