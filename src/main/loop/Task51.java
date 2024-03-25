package main.loop;

import java.util.StringJoiner;

public class Task51 {
    public static void loop(int n, int m) {
        StringJoiner joiner = new StringJoiner(" ");
        for (var i = Math.min(n, m); i <= Math.max(n, m); i++) {
            if (i % 2 == 0) {
                joiner.add(String.valueOf(0));
            } else {
                joiner.add(String.valueOf((int) Math.pow(i, 2)));
            }
        }
        System.out.println(joiner);
    }

    public static void main(String[] args) {
        loop(7,2);
    }
}

/*
Вывести серию преобразованных чисел
Ниже представлен метод loop(int n, int m), который принимает 2 целых положительных числа - n и m.
Задание: Написать код, который выводит в консоль ряд чисел от n до m(оба включительно),
отвечающие следующим условиям:
- Если число нечетное - вывести квадрат этого числа.
- Если число четное - вывести ноль.
Примечание: Учитывать, что неизвестно какое число больше - n или m.
Например, для чисел 7 и 2 вывод будет:
0 9 0 25 0 49
 */