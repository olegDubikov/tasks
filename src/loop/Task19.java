package loop;

import java.util.StringJoiner;

public class Task19 {

    public static void loop() {
        StringJoiner joiner = new StringJoiner(" ");

        for (int i = 107; i < 153; ++i) {
            if (i % 10 == 7) {
                String num = Integer.toString(i);
                joiner.add(num);
            }
        }
        System.out.println("Старт");
        System.out.println(joiner);
        System.out.println("Финиш");
    }

    public static void main(String[] args) {
        loop();
    }
}

/*
Вывести положительные трехзначные числа, оканчивающиеся на 7
Задание: Написать код, который выводит в консоль через пробел
в порядке возрастания все положительные трехзначные числа до 153
(не включая), оканчивающиеся на 7. Перед началом вывода нужно
вывести слово "Старт" в отдельной строке, а после окончания
вывода чисел - слово "Финиш", тоже в отдельной строке.

Вывод должен получиться такой:
Старт

107 117 127 137 147

Финиш
 */