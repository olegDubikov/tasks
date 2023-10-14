package loop;

import java.util.StringJoiner;

public class Task49 {
    public static void loop(int n, int m) {
        StringJoiner joiner = new StringJoiner("+");
        for (var i = Math.min(n, m); i <= Math.max(n, m); i++) {
            if (i % 2 == 0) {
                joiner.add(String.valueOf(i));
            }
        }
        System.out.println(joiner);
    }
}

/*
Вывести все четные числа от N до M
Ниже представлен метод loop(int n, int m), который принимает 2 целых положительных числа.

Задание: Написать код, который выводит в консоль все четные числа от n до m (оба включительно).
Числа при выводе должны разделяться знаком "+". Учитывать, что неизвестно какое из чисел больше - n или m.

Например, для чисел 10 и 3 вывод будет:
4+6+8+10
 */