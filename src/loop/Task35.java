package loop;

import java.util.StringJoiner;

public class Task35 {
    public static void loop(int num) {
        StringJoiner joiner = new StringJoiner(" ");
        for (var i = 0; i < 5; i++) {
            num -= 6;
            joiner.add(String.valueOf(num));
        }
        System.out.println(joiner);
    }
}
/*
Вывести предшествующие числа
Ниже представлен метод loop(int num), который принимает целое число.

Задание: Написать код, который выводит в консоль через пробел 5 предшествующих
входящему числу чисел (в убывающем порядке), причем разница между значениями
этих чисел должна быть равна 6.

Примечание: для сборки результирующей строки с выводом
значений через пробел нужно использовать StringJoiner.

Например, для числа 10 вывод будет:

4 -2 -8 -14 -20
 */